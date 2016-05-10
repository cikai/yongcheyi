define(["menu", "userManage"], function(menu, userManage) {

	function init() {

		menu.init();
		
		userManage.init();
		
	}

	return ({
		"init" : init
	});
});
