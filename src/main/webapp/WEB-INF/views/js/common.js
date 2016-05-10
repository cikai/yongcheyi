define(function() {

	function getContextPath() {
		var fullPath = window.location.pathname;
		var contextPath = fullPath.split("/")[1];
		return contextPath;
	}

	var loadPage = function(pageName) {
		url = "/" + getContextPath() + "/" + pageName;

		$.ajax(url, {
			dataType : "html"
		}).done(function(htmlContent) {
			$("#main").html(htmlContent);
			$("#main").scrollTop(0);
		}).fail(function(xhr) {
			console.log("error");
		});
	};
	return {
		loadPage : loadPage
	};
});