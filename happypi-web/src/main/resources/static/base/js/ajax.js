/**
 * ajax请求统一处理
 */
 
 /**
  * ajax请求统一处理,防止重复提交
  * @param
  * 	 element：请求地址或form对象,但不能为空(Sting或Object)
  * 	 options：请求选项
  * 	 options.error：请求失败时被调用的函数(可以不处理,有默认处理）
  * 	 options.success：请求成功后调用的回调函数
  * 	 options.data：发送到服务器的数据(Sting或Object)
  */
 var ajaxRequest = function(element, options) {
 	if(!element) {
		alert("请求地址或form对象,但不能为空!");
		return;
	}
	var isSubmit = false; //判断是否正在提交?如正在提交为true,为了防止重复提交.
	var type = "GET"; //请求方式,默认GET
	var url = element; //请求地址
	
	if(options != undefined) { 
		var successCallBack = (options.success != null && typeof(options.success) == "function") ? options.success : null;
		var errorCallBack = (options.error != null && typeof(options.error) == "function") ? options.error : null;
		var data = options.data != null ? options.data : null;
		var async = options.async != null ? options.async : true; //默认异步
		var waitObj = options.wait != null ? options.wait : null;
	}
	
	if (waitObj != null)
	{
		showWaitLoading(waitObj);
	}
	
	if(typeof element == "object") {
		if(element.tagName.toLowerCase() == "form") {
			if(isSubmit) {
				return; //为了防止重复提交.
			}
			isSubmit = true;
			type = "POST";
			url = element.action;
			data = jQuery("#"+element.id).serialize(); //序列化元素
		} else {
			alert("传入的不是form对象");
		}
	}
    //为请求选项赋初始值
	options ={type: type, url: url, dataType: "json", cache: false, contentType: "application/x-www-form-urlencoded; charset=utf-8", data: data, async: async};
	
	jQuery.extend(options, { //ajax请求开始
		error: function(XMLHttpRequest) { //ajax请求失败
			var status = XMLHttpRequest.status;
			if(status == 404) {
				alert("无法连接服务器!");
			} else {
				alert("服务器出现异常!");
			}
			if(errorCallBack != null) {
				errorCallBack(XMLHttpRequest);
			}
			if (waitObj != null)
			{
				hideWaitLoading(waitObj);
			}
		},
		success: function(data) { //请求成功
			try {
				isSubmit = false;
				if(!processAjaxError(data)) { //处理错误信息
					if (waitObj != null)
					{
						hideWaitLoading(waitObj);
					}
					return;	
				}
				if(successCallBack != null) {
					successCallBack(data);
				}
				if (waitObj != null)
				{
					hideWaitLoading(waitObj);
				}
			} catch(e) {
				if (waitObj != null)
				{
					hideWaitLoading(waitObj);
				}
	 			alert(e.message);
			}
		}
	});
	
	jQuery.ajax(options);
 };
 
/**
 * 处理ajax请求返回的错误信息
 * 
 * @param data json数据
 */
 var processAjaxError = function(data) {		 
	try {
		if(!data) {
			return false;
		}					 
		if(data.error) {							 
			messageBox(data.error);			 
			return false;
		}
		if(data.exception) {						 
			messageBox(data.exception);
			return false;
		}
		return true;
	} catch(e) {}
 };
 
 /**
  * 扩展jQuery对象,返回控件元素
  * 
  * @param element
  */
 jQuery.extend({
 	jqID : function(element) {
		if(arguments.length > 1) {
	    	for (var i = 0, elements = [], length = arguments.length; i < length; i++) {
	      		elements.push($(arguments[i]));
	    	}
	    	return elements;
	  	}
	  	if(typeof element == "string" && element.trim() != "") {
	  		element = document.getElementById(element);
	  	}
		return element;
	}
 });
 String.prototype.trim = function() {
 	return this.replace(/(^\s*)|(\s*$)/g, ""); 
 };
 