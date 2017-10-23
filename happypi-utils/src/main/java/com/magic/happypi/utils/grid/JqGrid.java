package com.magic.happypi.utils.grid;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.magic.happypi.utils.Util;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 设置jqGrid请求和应答参数
 *
 * @author sxc
 *
 */
public class JqGrid {

	//请求参数
	private int prm_page = 0; //表示请求页码的参数
	private int prm_rows = 0; //表示请求行数的参数
	private String filters = ""; //表示请求查询过滤条件参数

	private String sort = ""; //表示用于排序的列名的参数
	private String order = ""; //表示采用的排序方式的参数

	//查询数据库使用的参数
	private int page = 0; //页码的参数
	private int start = 0; //开始记录数
	private int rows = 0; //每页行数

	private int subMainGridId = 0; //Grid请求带的一些其他参数
	private int subGridId = 0;
	private String args = "";

	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return page;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getSubMainGridId() {
		return subMainGridId;
	}
	public void setSubMainGridId(int subMainGridId) {
		this.subMainGridId = subMainGridId;
	}
	public int getSubGridId() {
		return subGridId;
	}
	public void setSubGridId(int subGridId) {
		this.subGridId = subGridId;
	}
	public String getArgs() {
		return args;
	}
	public void setArgs(String args) {
		this.args = args;
	}

	/**
	 * 设置jqGrid请求参数
	 *
	 * @param model
	 * @return
	 */
	public String setParameter(ModelMap model) {
		prm_page = Util.objInt(model.get("prm_page"));
		prm_rows = Util.objInt(model.get("prm_rows"));
		page = prm_page;
		sort = Util.objStr(model.get("prm_sort"));
		order = Util.objStr(model.get("prm_order"));
		subMainGridId = Util.objInt(model.get("subMainGridId"));
		subGridId = Util.objInt(model.get("subGridId"));
		args = Util.objStr(model.get("args"));

		//计算开始记录数
		start = (prm_page - 1) * prm_rows;
		rows = prm_rows;

		StringBuffer sql = new StringBuffer();
		//查询过滤条件
		this.filters = Util.objStr(model.get("filters"));
		if(!Util.strIsEmpty(this.filters)) {
			Filters filters = getFilters(this.filters);
			List<Rules> rulesList = getRulesList(filters.getRules());
			if(!Util.strIsEmpty(filters.getGroupOp())) {
				sql.append(getWhere(filters, rulesList));
			}
		}

		return sql.toString();
	}

	/**
	 * getWhere
	 *
	 * @param filters
	 * @param rulesList
	 * @return
	 */
	private String getWhere(Filters filters, List<Rules> rulesList) {
		StringBuffer sqlWhere = new StringBuffer();
		String andOr = filters.getGroupOp();
		for(Rules rules: rulesList) {
			//删除字段查询
			if(rules.getField().toLowerCase().equals("i_del") ||
					rules.getField().toLowerCase().equals("c_del")) {
				if(rules.getData().equals("0")) {
					sqlWhere.append(" and i_del <> 1 ");
				} else if(rules.getData().equals("1")) {
					sqlWhere.append(" and i_del = 1 ");
				} else if(rules.getData().equals("2")) {
					sqlWhere.append(" and 1 = 1 ");
				}
				continue;
			 }
			//关闭标志字段查询
			if(rules.getField().toLowerCase().equals("i_close_flag") ||
					rules.getField().toLowerCase().equals("c_close_flag")) {
				if(rules.getData().equals("0")) {
					sqlWhere.append(" and i_close_flag = 0 ");
				} else if(rules.getData().equals("1")) {
					sqlWhere.append(" and i_close_flag = 1 ");
				} else if(rules.getData().equals("2")) {
					sqlWhere.append(" and 1 = 1 ");
				}
				continue;
			}
			//特殊审核字段查询
			if(rules.getField().toLowerCase().equals("i_mark")) {
				if(rules.getData().equals("0")) {
					sqlWhere.append(" and I_MARK = 0 ");
				} else if(rules.getData().equals("1")) {
					sqlWhere.append(" and I_MARK = 1 ");
				} else if(rules.getData().equals("2")) {
					sqlWhere.append(" and 1 = 1 ");
				}
				continue;
			}
			//名字字段查询
			if(rules.getField().toLowerCase().equals("c_name")) {
				sqlWhere.append(" ").append(andOr).append(" (").append(rules.getField())
				.append(" like '%").append(rules.getData()).append("%' or c_aliascode like '%")
				.append(rules.getData().toLowerCase()).append("%')");
				continue;
			}
			//组合查询条件
			if(rules.getField().toLowerCase().startsWith("d_")) {
				sqlWhere.append(" ").append(andOr).append(" trunc(").append(rules.getField()).append(") ").append(getOp(rules.getOp()))
				.append(" to_date('").append(rules.getData()).append("','yyyy-mm-dd')");
			} else {
				sqlWhere.append(" ").append(andOr).append(" ").append(rules.getField()).append(" ").append(getOp(rules.getOp()));

				if(rules.getOp().toLowerCase().equals("cn") || rules.getOp().toLowerCase().equals("nc")) {
					sqlWhere.append(" '%").append(rules.getData()).append("%'");
				} else if(rules.getOp().toLowerCase().equals("in") || rules.getOp().toLowerCase().equals("ni")) {
					sqlWhere.append(" ('").append(rules.getData()).append("')");
				} else {
					sqlWhere.append(" '").append(rules.getData()).append("'");
				}
			}

		}

		return sqlWhere.toString();
	}

	/**
	 * getOp
	 *
	 * @param op
	 * @return
	 */
	private String getOp(String op) {
		if(op.toLowerCase().equals("eq")) {
			return "=";
		} else if(op.toLowerCase().equals("ne")) {
			return "<>";
		} else if(op.toLowerCase().equals("lt")) {
			return "<";
		} else if(op.toLowerCase().equals("le")) {
			return "<=";
		} else if(op.toLowerCase().equals("gt")) {
			return ">";
		} else if(op.toLowerCase().equals("ge")) {
			return ">=";
		} else if(op.toLowerCase().equals("cn")) {
			return "like";
		} else if(op.toLowerCase().equals("nc")) {
			return "not like";
		} else if(op.toLowerCase().equals("in")) {
			return "in";
		} else if(op.toLowerCase().equals("ni")) {
			return "not in";
		} else if(op.toLowerCase().equals("bw")) {
			return "=";
		}
		return "";
	}

	/**
	 * getFilters
	 *
	 * @param filters
	 * @return
	 */
	private Filters getFilters(String filters) {
//		JSONArray ja = JSONArray.fromObject(new StringBuffer().append("[").append(filters).append("]").toString());
        JSONArray ja = JSONArray.parseArray(new StringBuffer().append("[").append(filters).append("]").toString());
		JSONObject jo = ja.getJSONObject(0);

		Filters filter = new Filters();
		filter.setGroupOp(Util.objStr(jo.get("groupOp")));
		filter.setRules(Util.objStr(jo.get("rules")));

		return filter;
	}

	/**
	 * getRulesList
	 *
	 * @param rules
	 * @return
	 */
	private List<Rules> getRulesList(String rules) {
		List<Rules> rulesList = new ArrayList<Rules>();
//		JSONArray ja = JSONArray.fromObject(rules);
        JSONArray ja = JSONArray.parseArray(rules);

		for(int i = 0; i < ja.size(); i++) {
			JSONObject jo = ja.getJSONObject(i);
//			Rules rule = (Rules)JSONObject.toBean(jo, Rules.class);
            Rules rule = (Rules)JSONObject.toJavaObject(jo,Rules.class);
			rulesList.add(rule);
		}

		return rulesList;
	}

	/**
	 * 设置用户数据
	 *
	 * @param fenyeMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Map<String, Object> setUserData(Map fenyeMap) {
		Footerrow footerrow = (Footerrow)fenyeMap.get("footerrow");
		Map<String, Object> userData = new HashMap<String, Object>();
		//设置页尾数据行标题
		userData.put(footerrow.getTitleRow(), footerrow.getTitle());
		//设置页尾数据行
		Map<String, Object> row = footerrow.getRow();
		for(String key : row.keySet()) {
			userData.put(key, row.get(key));
		}
		return userData;
	}

	/**
	 * 设置jqGrid应答参数
	 *
	 */
	@SuppressWarnings("rawtypes")
	public Map getParameter(Map fenyeMap) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("json_root", fenyeMap.get("fenyeList")); //表示实际模型数据的入口
		jsonMap.put("json_records", fenyeMap.get("recordSize")); //表示数据行总数的参数
		jsonMap.put("json_page", prm_page); //表示当前页码的参数

		//计算页码总数
		int json_total = (int)Math.ceil(Util.objDouble(fenyeMap.get("recordSize")) / Util.objDouble(rows));
		jsonMap.put("json_total", json_total);//表示页码总数的参数

		//页尾数据行
		if(fenyeMap.containsKey("footerrow") && fenyeMap.get("footerrow") != null) {
			Map<String, Object> userdata = setUserData(fenyeMap);
//			userdata.put("newSql", fenyeMap.get("newSql"));
//			userdata.put("newArgs", fenyeMap.get("newArgs"));
			jsonMap.put("userdata", userdata);
	    //用户数据
		} else {
			Map<String, Object> userdata = new HashMap<String, Object>();
//			userdata.put("newSql", fenyeMap.get("newSql"));
//			userdata.put("newArgs", fenyeMap.get("newArgs"));
			jsonMap.put("userdata", userdata);
		}

		return jsonMap;
	}

	/**
	 * 设置jqGrid应答参数
	 *
	 * @param pageInfo 分页查询结果集
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Map getParameter(PageInfo pageInfo,Footerrow footerrow) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("json_root", pageInfo.getList()); //表示实际模型数据的入口
		jsonMap.put("json_records", pageInfo.getTotal()); //表示数据行总数的参数
		jsonMap.put("json_page", prm_page); //表示当前页码的参数

		//计算页码总数
		int json_total = (int)Math.ceil(Util.objDouble(pageInfo.getTotal()) / Util.objDouble(rows));
		jsonMap.put("json_total", json_total);//表示页码总数的参数

		//页尾数据行（目前不好使有需要的话在弄吧）
		if(footerrow != null) {
			Map<String, Object> userdata = setUserData(null);
//			userdata.put("newSql", fenyeMap.get("newSql"));
//			userdata.put("newArgs", fenyeMap.get("newArgs"));
			jsonMap.put("userdata", userdata);
			//用户数据
		} else {
			Map<String, Object> userdata = new HashMap<String, Object>();
//			userdata.put("newSql", fenyeMap.get("newSql"));
//			userdata.put("newArgs", fenyeMap.get("newArgs"));
			jsonMap.put("userdata", userdata);
		}
		return jsonMap;
	}

}
