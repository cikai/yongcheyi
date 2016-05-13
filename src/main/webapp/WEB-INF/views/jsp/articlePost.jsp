<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/libs/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="css/articlePost.css">
<script src="js/libs/jquery-2.1.4.js"></script>
<script src="js/libs/jquery.dataTables.js"></script>
<script src="js/articlePost.js"></script>

<script src="assets/trumbowyg.js"></script>
<script src="assets/plugins/base64/trumbowyg.base64.js"></script>
<link rel="stylesheet" href="assets/design/css/trumbowyg.css">

<title></title>
</head>

<body>
	<div id="articleSearch">
	检索条件
		<form id="articleSearchForm">
		<span>ID:</span>
			<input type="text" name="id" value="" placeholder="请输入检索ID">
		</form>
		<button id="searchBtn" style="margin-top: 5px;">检索</button>
	</div>
	
	<div class="articleTable">
		<table id="articleTable"></table>
	</div>
	
	<div id="odiv" style="display: none; position: absolute; z-index: 100;"></div>
	<div onmousedown="show_element(event)" style="clear: both"
		id="customized-buttonpane" class="editor"></div>

</body>
</html>
