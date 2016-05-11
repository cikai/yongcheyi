define(["menu", "userManage", "articlePost"], function(menu, userManage, articlePost) {

	function init() {

		menu.init();
		
		userManage.init();
		
		articlePost.init();
		
	}

	return ({
		"init" : init
	});
});
