define(["common"], function(commmon) {

	function init() {

		var deferred = new $.Deferred();
		
		initListener();

		deferred.resolve();

		return $.when(deferred);
	}
	
	function initListener() {
		$("#articleAdd").off("click").on("click", function() {
			//common.loadPage("ArticleAdd");
			$("#main").html("文章管理页面");
		});
		
		$("#userManage").off("click").on("click", function() {
			//common.loadPage("ArticleAdd");
			$("#main").html("用户管理页面");
		});
	}

	return ({
		"init" : init
	});
});
