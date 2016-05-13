$(document).ready(function() {
	initListener();
});

function initListener() {
	$("#searchBtn").off("click").on("click", function() {
		initDataTable();
	});
}

function initDataTable() {
	var dataList = new Array();
	var tableList = [];
	$.ajax({
		url : 'searchArticle',
		type : 'post',
		dataType : 'json',
		data : $("#articleSearchForm").serialize(),
		success : function(data) {
			for (var i = 0; i < data.result.articleList.length; i++) {
				dataList.push(data.result.articleList[i].id);
				dataList.push(data.result.articleList[i].title);
				dataList.push(data.result.articleList[i].thumbMediaId);
				dataList.push(data.result.articleList[i].author);
				dataList.push(data.result.articleList[i].digest);
				dataList.push(data.result.articleList[i].showCoverPic);
				dataList.push(data.result.articleList[i].contentSourceUrl);
				dataList.push(data.result.articleList[i].softDeleteFlag);
				dataList.push(data.result.articleList[i].createTime);
				dataList.push(data.result.articleList[i].updateTime);
			}
			for (var i = 0; i < dataList.length; i += 11) {
				tableList.push(dataList.slice(i, i + 11));
			}
			createTable(tableList);
			 $("#customized-buttonpane").html(data.result.articleList[0].content);
		},
		error : function(data) {
			$('#articleTable').html("服务器错误！");
		}
	});
}

function createTable(tableList) {
	$('#articleTable').DataTable({
		data : tableList,
		columns : [ {
			title : "ID",
			name : "id"
		}, {
			title : "标题",
			name : "title",
			fn : contentView
		}, {
			title : "封面素材ID",
			name : "thumbMediaId"
		}, {
			title : "作者",
			name : "author"
		}, {
			title : "摘要",
			name : "digest"
		}, {
			title : "显示封面",
			name : "showCoverPic"
		}, {
			title : "文章地址",
			name : "contentSourceUrl",
			fn : csUrlHandler
		}, {
			title : "状态",
			name : "softDeleteFlag"
		}, {
			title : "创建时间",
			name : "createTime"
		}, {
			title : "更新时间",
			name : "updateTime"
		} ]
	});

	$('#articleTable tbody').on('click', 'tr td:nth-child(7)',
			function(value, rowValue, tdDom) {
				var name = $(this).text();
				var $dom = $("<a href='javascript:void(0)'></a>").text(value);
				$dom.on("click", name);
				$dom.appendTo(tdDom);
			});

}

function csUrlHandler(value, rowValue, tdDom) {
	var $dom = $("<a href='javascript:void(0)'></a>").text(value);
	$dom.on("click", rowValue);
	$dom.appendTo(tdDom);
	return false;
}

function contentView(value, rowValue, tdDom) {

	console.log(value + rowValue + tdDom);

	var $dom = $("<a href='javascript:void(0)'></a>").text(value);
	$dom.on("click", function() {
		alert("sdf");
	});
	$dom.appendTo(tdDom);
	return false;
}
