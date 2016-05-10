define([], function() {

	'use strict';

	function init() {

		var deferred = new $.Deferred();

		getEvaluation();

		deferred.resolve();

		return $.when(deferred);
	}

	function getEvaluation() {

		$('li').on("click", function() {
			window.location.href = "/yongcheyi" + "/evaluationList";
		})
	}

	return ({
		"init" : init
	});
});
