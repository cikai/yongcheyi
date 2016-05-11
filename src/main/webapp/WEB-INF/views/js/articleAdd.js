$(document).ready(function() {
	initListener();
});

function initListener() {

	$("#submit").off("click").on("click", function() {
		
		console.log($("#content").val());
		
		$("#softDeleteFlag").val("posted");
		
		$.ajax({
			url : "addArticle",
			data : $("#addForm").serialize(),
			type : "get",
			async : false,
			dataType : "json",
			success : function(data) {
				alert("提交成功！");
				$("#addForm")[0].reset();
			},
			error : function(data) {
				console.log(data);
			}
		});
	});

	$("#clear").off("click").on("click", function() {
		$("#addForm")[0].reset();
	});
	
}
