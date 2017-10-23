package com.magic.happypi.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * JSON操作对象,系统前台与后台进行通讯时使用的对象,注意当JAVA程序向页面
 * 响应时,及时无内容返回也要返回一个空的对象
 * 
 * 使用方法：
 * new JSONResult()
 *  .setParameter("exception", 异常信息)
 *  .setParameter("error", 错误信息)
 *  .setParameter("success", 成功信息)
 *  .setParameter("parameter1", new String())
 *  .setParameter("parameter2", new Object())
 *  .setParameter("parameter3", new HashMap())
 * 
 * @author sxc
 *
 */
public class JSONResult {
	
	/**
	 * 用于返回异常信息
	 */
	private String exception = "";
	
	/**
	 * 用于返回错误信息
	 */
	private String error = "";
	
	/**
	 * 用于返回成功信息
	 */
	private String success = "";
	
	/**
	 * 任意类型的Object,后台与前台页面进行数据传递的主要方式,具体内容根据各
	 * 控制器中约定决定
	 */
	private Map<String, Object> parameter = new HashMap<String, Object>();

	/**
	 * 设置异常信息
	 * 
	 * @return JSONResult
	 */
	public JSONResult setException(String exception) {
		this.exception = exception;
		return this;
	}
	
	/**
	 * 设置错误信息
	 * 
	 * @return JSONResult
	 */
	public JSONResult setError(String error) {
		this.error = error;
		return this;
	}
	
	/**
	 * 设置成功信息
	 * 
	 * @return JSONResult
	 */
	public JSONResult setSuccess(String success) {
		this.success = success;
		return this;
	}
	
	/**
	 * 设置数据对象
	 * 
	 * @param parameter
	 * @return JSONResult
	 */
	public JSONResult setParameter(Map<String, Object> parameter) {
		this.parameter.putAll(parameter);
		return this;
	}
	
	/**
	 * 设置数据对象,可以多次操作
	 * 
	 * @param key
	 * @param value
	 * @return JSONResult
	 */
	public JSONResult setParameter(String key, Object value) {
		this.parameter.put(key, value);
		return this;
	}

	public String getException() {
		return exception;
	}

	public String getError() {
		return error;
	}

	public String getSuccess() {
		return success;
	}

	public Map<String, Object> getParameter() {
		return parameter;
	}


}
