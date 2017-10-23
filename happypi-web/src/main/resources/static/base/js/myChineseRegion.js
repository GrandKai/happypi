/**
 * 省市区插件
 * 
 * bootstrap-chinese-region.min.css
 * bootstrap-chinese-region.js
 * sql_areas.json
 * sql_areas_names.json
 */
(function($){
        $.fn.myChineseRegion=function(options){
            var defaults={
            		addressId:'',
            		placeholder:'选择你的地区',
            		addressValue:''   
            };
            var opts = $.extend(defaults,options);
            var proCityRegHtml = 
            				"<div id=\""+opts.addressId+"-chinese-region\" class=\"bs-chinese-region flat dropdown\" data-submit-type=\"id\" data-min-level=\"1\" data-max-level=\"3\">"
            				+"<input type=\"text\" class=\"form-control\" name=\""+opts.addressId+"\" id=\""+opts.addressId+"\" placeholder=\""+opts.placeholder+"\" data-toggle=\"dropdown\" readonly=\"readonly\" value=\""+opts.addressValue+"\"/>"
            				+"<div class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dLabel\">"
            				+"<div>"
            				+"<ul class=\"nav nav-tabs\" role=\"tablist\">"
            				+"<li role=\"presentation\" class=\"active\"><a href=\"#"+opts.addressId+"-province\" data-next=\""+opts.addressId+"-city\" role=\"tab\" data-toggle=\"tab\">省份</a></li>"
            				+"<li role=\"presentation\"><a href=\"#"+opts.addressId+"-city\" data-next=\""+opts.addressId+"-district\" role=\"tab\" data-toggle=\"tab\">城市</a></li>"
            				+"<li role=\"presentation\"><a href=\"#"+opts.addressId+"-district\" data-next=\""+opts.addressId+"-street\" role=\"tab\" data-toggle=\"tab\">县区</a></li>"
            				+"</ul>"
            				+"<div class=\"tab-content\">"
            				+"<div role=\"tabpanel\" class=\"tab-pane active\" id=\""+opts.addressId+"-province\">--</div>"
            				+"<div role=\"tabpanel\" class=\"tab-pane\" id=\""+opts.addressId+"-city\">--</div>"
            				+"<div role=\"tabpanel\" class=\"tab-pane\" id=\""+opts.addressId+"-district\">--</div>"
            				+"</div>"
            				+"</div>"
            				+"</div>"
            				+"</div>";		
            $(this).html(proCityRegHtml);
            var data_ = [];
			for (var i = 0; i < province_city_region.length; i++) {
				var area = {id:province_city_region[i].id,name:province_city_region[i].cname,level:province_city_region[i].level,parentId:province_city_region[i].upid};
				data_[i] = area;
			}
			$('#'+opts.addressId+'-chinese-region').chineseRegion('source',data_);
        };
    })(jQuery);