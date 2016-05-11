require.config({
	paths : {
		"common": "common",
		"dataTable": "libs/jquery.dataTables"
	}
});

require([ "top" ], function(top) {
	$(function() {
		top.init();
	});
});