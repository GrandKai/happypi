$(document).ready(function() {
	successfulLandingData();
});
var menuStr = '';

function successfulLandingData(){
 	new ajaxRequest("/login/successfulLandingData", {
 		async: false,
		success: function(data){
			if(data.success == "ok"){
				var session = data.parameter.SessionUser;
				setUser(session.user);
				setRole(session.roleList);
				setMenu(session.menuList);
			}
		}
		// ,
		// data: param,
		// wait:"main_page_all"
	});
}

function setUser(user){
	$("#userName").html(user.userName);
}

function setRole(role){
	var nameStr = '';
	for(var i = 0;i < role.length;i++){
		nameStr += role[i].roleName + ',';
	}
	$("#roleName").html(nameStr.substring(0,nameStr.length-1));
}

function setMenu(menuList){
	for(var i = 0;i < menuList.length;i++){
		var menu = menuList[i];
		if(menu.isLeaf == 0){
			if(i > 0){
				menuStr += '</ul>';
				menuStr += '</li>';
			}
			menuStr += '<li>';
			menuStr += '<a href="javascript:void(0);"><i class="fa fa-gear"></i> <span class="nav-label">'+menu.menuName+'</span><span class="fa arrow"></span></a>';
			menuStr += '<ul class="nav nav-second-level">';
		} else {
			menuStr += '<li><a class="J_menuItem" href="'+menu.menuUrl+'">'+menu.menuName+'</a></li>';
		}
	}
	menuStr += '</ul>';
	menuStr += '</li>';
	
	$("#side-menu").append(menuStr);
	
}
