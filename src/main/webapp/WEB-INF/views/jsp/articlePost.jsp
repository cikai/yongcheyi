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

<title></title>
</head>

<body>
	<div id="articleSearch">
		<form id="articleSearchForm">
			<input type="text" name="id" value="" placeholder="请输入检索ID">
		</form>
		<button id="searchBtn" style="margin-top: 5px;">检索</button>
	</div>
	
	<div class="articleTable">
		<table id="articleTable"></table>
	</div>
	
	<div id="contentPreview"></div>

</body>
</html>
