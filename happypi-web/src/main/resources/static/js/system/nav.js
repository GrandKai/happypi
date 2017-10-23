$.get("http://localhost:9090/menu/list").done(function (data) {
	if (0 === data.code) {
		var content = data.content;
		if (content) {
			for (var i = 0; i < content.length; i++) {
				var item = content[i];


			<li>
				<a href="mailbox.html"><i class="fa fa-envelope"></i> <span class="nav-label">订单管理</span><span class="label label-warning pull-right">16</span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="#">订单管理</a></li>
				<li><a href="#">订单支付</a></li>
				<li><a href="#">订单退款</a></li>
				<li><a href="#">订单发货</a></li>
				<li><a href="#">订单退货</a></li>
				<li><a href="#">发货点管理</a></li>
				<li><a href="#">快递单模板</a></li>
				</ul>
				</li>
				console.log(item.menuName);
			}
		}
	}
});