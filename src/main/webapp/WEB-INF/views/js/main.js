require.config({
	paths : {
		"common" : "common/common",
	}
});

require([ "top" ], function(top) {
	$(function() {
		top.init();
	});
});