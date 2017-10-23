/**
 * 系统javascript工具类库
 * 
 */
var Util = new _Util();
function _Util() {
	
	/**
	 * 为元素添加事件监听器
	 *
	 * @param elementId{String} 添加事件监听器的元素
	 * @param eventType{String} 事件类型,不包括IE中的事件前缀on,如load,click,unload等
	 * @param handler{function} 事件处理函数句柄
	 */
	this.on = function(elementId, eventType, handler) {
		try {
			if(elementId.addEventListener) {
				elementId.addEventListener(eventType, handler, false);		
			} else if(elementId.attachEvent) {
				elementId.attachEvent("on" + eventType, handler);
			} else {
				elementId["on" + eventType] = handler;
			}
		} catch(e) {
			alert("Util.on出现异常,异常消息：" + e.message);
		}
	};
	
	/**
	 * 打开模态窗口
	 * 
	 * @param url 页面地址
	 * @param width 窗口宽度 
	 * @param height 窗口高度
	 * @param scroll 是否带滚动条 no:不带,yes:带
	 */
	this.openModalDialog = function(url, width, height, arguments, scroll) {
		if(scroll == undefined || scroll == null) {
			scroll = "no";
		}
		var features = "dialogWidth:" + width + "px;dialogHeight:" + height + "px;scroll:" + scroll + ";titlebar:no;menubar:no;location:no;toolbar:no;status:no;help:no";
		return showModalDialog(url, arguments, features);
	};	 
	
	/**
	 * 返回父窗体
	 */
	this.parentWindow = function() {
		var g_parentWindow = window.opener;   
		if(!g_parentWindow) {
			g_parentWindow = parent.dialogArguments;
		}
		return g_parentWindow;
	};
	
	/**
	 * 设置控件焦点,当控件id不存在时,不会出现异常
	 * 
	 × @param elementId 控件id
	 */
	this.focus = function(elementId) {		
		var element = document.getElementById(elementId);
		try {
			if(element) {
				element.focus();
				element.select();
			}	
		} catch(e) {	
			alert("Util.focus出现异常，异常消息：" + e.message);		
		}		
	};
	
	/**
	 * 字符串格式化函数,相当于java中的String.format
	 * 
	 * 占位符格式:{n},如：{0}{1}{2}分别代表不同位置的占位符
	 * {0}与第一个参数对应,{1}与第二个参数对应，后面依次类推
	 */
	this.format = function() {		 		
		if(arguments.length > 0) {
			for(var i = 1, str = arguments[0], length = arguments.length; i < length; i++) {
				var re = new RegExp("\\{" + (i - 1) + "\\}", "gm");
				str = str.replace(re, arguments[i]);
			}
			return str;
		} else {
			alert("Util.format输入的格式不正确!");
		}
	};
	
	/**
	 * 删除字符串左边空格
	 * 
	 * @param str 待处理的字符串
	 */
	this.ltrim = function(str) {
	    var whitespace = new String(" \t\n\r");
	    var s = new String(str); 
		if(whitespace.indexOf(s.charAt(0)) != -1) {
	        var j = 0, i = s.length;
	        while(j < i && whitespace.indexOf(s.charAt(j)) != -1) {
	            j++;
	        }
	        s = s.substring(j, i);
	    }
	    return s.toString();
	};
	
	/**
	 * 删除字符串右边空格
	 * 
	 * @param str 待处理的字符串	 
	 */
	this.rtrim = function(str) {
	    var whitespace = new String(" \t\n\r");
	    var s = new String(str);
	    if (whitespace.indexOf(s.charAt(s.length-1)) != -1) {
	        var i = s.length - 1;
	        while (i >= 0 && whitespace.indexOf(s.charAt(i)) != -1) {
	            i--;
	        }
	        s = s.substring(0, i + 1);
	    }
	    return s.toString();
	};
	
	/**
	 * 删除字符串两边空格
	 *   
	 * @param str 待处理的字符串
	 */
	this.trim = function(str) {
	    return Util.rtrim(Util.ltrim(str)).toString();
	};
	
	/**
	 * 判断一个字符串是否为空字符串,当str == null 或 str.equals("")都为空
	 * 
	 * 注:当字符串中包含空格时,也不是空字符串,即方法不会截断字符串中的空格
	 * 
	 * @param str 待判断的字符串
	 * @return boolean true:传入的字符串为空,false:字符串不为空
	 */
	this.strIsEmpty = function(str) {
		if(str == undefined || str == null) {
			return true;
		} else if(typeof str == "object" && str.length <= 0) {
			return true;
		} else if(typeof str == "string" && Util.trim(str) == "") {
			return true;
		}
		return false;
	};
	
	/**
	 * 四舍五入
	 *
	 * @param val 需要四舍五入的数字
	 * @param scale 小数点后保留几位
	 */
	this.round = function(val, scale) {
		return Math.round(val * Math.pow(10, scale)) / Math.pow(10, scale);
	};
	
	/**
	 * 将字符串转换成整数型,当传入字符串为非数值型变量则返回0
	 * 
	 * @param val 数值格式的字符串
	 */
	this.parseInt = function(val) {
		var result = 0;		
		if(Util.strIsEmpty(val)) {
			return 0;		
		} else {
			result = parseInt(val, 10);
			if(isNaN(result)) {
				result = 0;
			}
		}
		return result;	
	};
	
	/**
	 * 将字符串转换成浮点型,当传入字符串为非数值型变量则返回0
	 * 
	 * @param val 数值格式的字符串
	 */
	this.parseFloat = function(val) {
		var result = 0;
		if(Util.strIsEmpty(val)) {
			return 0;
		} else {
			result = parseFloat(val);
			if(isNaN(result)) {
				result = 0;
			}
		}
		return result;		
	};
	
	/**
	 * 获得字符串的实际长度（一个中文长度为2）
	 * 
	 * @param strUnicode 待处理的字符串
	 */
	this.length = function(strUnicode) {
		var intLength = 0;
	    for (var i = 0;i < strUnicode.length; i++) {
	        if ((strUnicode.charCodeAt(i) < 0) || (strUnicode.charCodeAt(i) > 255)) {
	            intLength = intLength + 2;
	        } else {
	            intLength = intLength + 1;
	        }   
	    }
		return intLength;
	};	
	
	/**
	 * 格式化时间
	 * 
	 * @param 格式化时间为2位字符串
	 */
	 this.formatTime = function(str) {
	 	str = ("00" + str);
	  	return str.substr(str.length - 2);
	 };
	 
	 /**
	  * 返回当前日期
	  */
	 this.returnDate = function() {
	 	var date = new Date();
	 	return(date.getFullYear() + Util.formatTime(date.getMonth() + 1) + Util.formatTime(date.getDate()));
	 };
	
	/**待用审批选项及录入审批信息窗口
	 * 	返回值 returnData ={
		cmemo //审批信息；
		isCheck //操作 null 没有操作不 ， true 执行审批 ， false 执行驳回
		}
	 */
	this.returnCheckForm = function() {
		return this.openModalDialog("checkFormPageControl.do?method=show", 300, 220, window);
	};
	
	/**
	 * 关闭窗体，刷新grid
	 * idStr 关闭按钮id
	 * grid 要刷新的fromId
	 * from 要刷新的fromId
	 */
	this.closeWindow = function(idStr,grid,from){
		//刷新父窗体grid
		from.reset();
		grid.refresh();
		$("#"+idStr).trigger("click");
	};
	 
	/**
	 * 关闭窗体，刷新grid
	 * idStr 关闭按钮id
	 * grid 要刷新的fromId
	 */
	this.closeWindowNotFrom = function(idStr,grid){
		grid.refresh();
		$("#"+idStr).trigger("click");
	 };
	   
};	
