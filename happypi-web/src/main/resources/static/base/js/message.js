/**
 * 消息对话框
 */
function messageBox(message, question) {
	if (!question && question == null) {
		alert(message);
	} else {
		return confirm(message);
	}
};

function showWaitLoading(objId) {
	if ((objId == null) || (objId == "")) {
		return;
	}
	$("#" + objId).showLoading();
};

function hideWaitLoading(objId) {
	if ((objId == null) || (objId == "")) {
		return;
	}
	$("#" + objId).hideLoading();
};
