define([ "common" ], function(common) {

	function init() {

		var deferred = new $.Deferred();

		initListener();

		deferred.resolve();

		return $.when(deferred);
	}

	function initListener() {
		$("#articleAdd").off("click").on("click", function() {
			common.loadPage("articleAdd");
		});

		$("#userManage").off("click").on("click", function() {
			common.loadPage("userManage");
		});
	}

	return ({
		"init" : init
	});
});
