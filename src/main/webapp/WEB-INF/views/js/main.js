require.config({
	paths : {
		"common": "common"
	}
});

require([ "top" ], function(top) {
	$(function() {
		top.init();
	});
});