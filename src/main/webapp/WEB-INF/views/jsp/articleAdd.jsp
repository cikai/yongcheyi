<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/libs/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/articleAdd.css">
<link rel="stylesheet" type="text/css"
	href="css/libs/jquery.dataTables.css">
<script src="js/libs/jquery-2.1.4.js"></script>
<script src="js/articleAdd.js"></script>
<script data-main="js/main" src="js/libs/require.js"></script>

<title></title>
</head>

<body>
	<div id="addArticle">
		<form id="addForm">
			<table id="addTable">
				<tr>
					<td>标题</td>
					<td><input type="text" name="title" id="title"></td>
				</tr>

				<tr>
					<td>封面素材ID</td>
					<td><input type="text" name="thumbMediaId" id="thumbMediaId"></td>
				</tr>

				<tr>
					<td>作者</td>
					<td><input type="text" name="author" id="author"></td>
				</tr>

				<tr>
					<td>摘要</td>
					<td><textarea name="digest" id="digest"></textarea></td>
				</tr>

				<tr>
					<td>显示封面</td>
					<td><select name="showCoverPic" id="showCoverPic">
							<option value="1">显示</option>
							<option value="0">不显示</option>
					</select></td>
				</tr>

				<tr>
					<td>文章地址</td>
					<td><input type="text" name="contentSourceUrl"
						id="contentSourceUrl"></td>
				</tr>

				<tr>
					<td><input type="hidden" name="softDeleteFlag" value="" 
						id="softDeleteFlag"></td>
				</tr>
			</table>
		</form>
		<button id="submit">提交</button>
		<button id="clear">重置</button>
	</div>
</body>
</html>
