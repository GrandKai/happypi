$(document).ready(function() {
	$('#loginButton').bind("click", loginFun);
	document.onkeydown = function(e){
	    var ev = document.all ? window.event : e;
	    if(ev.keyCode==13) {
	    	loginFun();
	     }
	}
	//验证函数
	checkFun();
	$("#addPage").modal();
});
var validate;

function loginFun() {
	var check = validate.checkFrm()
	if (!check) {
		return;
	}
	var form = $.jqID("form");
	new ajaxRequest(form, {
		success : function(data) {
			if (data.success == "ok") {
				window.location.href = "/login/indexPage";
			} else {
				alert(data.success);
			}
		}
	});
};

function checkFun() {
	var options = {
		formName : "form",
		elements : {
			"userName" : {
				required : true
			},
			"passwd" : {
				required : true
			}
		}
	};
	validate = new createValidate(options);
};