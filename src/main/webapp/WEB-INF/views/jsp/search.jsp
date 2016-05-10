<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/libs/jquery.mobile-1.4.5.css">
<link rel="stylesheet" type="text/css" href="css/top.css">
<script src="js/libs/jquery-2.1.4.js"></script>
<script src="js/libs/jquery.mobile-1.4.5.js"></script>
<script src="js/search.js"></script>
<script data-main="js/main" src="js/libs/require.js"></script>

<title>找用品 - 按车型</title>
</head>

<body>
	<nav class="nav-channel">
		<span class="channel">用车易</span> <span class="channel">找用品 -
			按车型</span>
	</nav>
	<div class="searchBox">
		<input type="text" name="searchTxt" id="search" value=""
			placeholder="请输入">
	</div>
	<div class="type">
		<h3>热门品牌</h3>
		<div class="type-brandgroup">
			<ul id="ul_hotBrandList" class="hot-brandgroup">
				<li v="1"><img src="images/hot-brandgroup/1.jpg"><br>
				<span id="sp_1">大众</span></li>

				<li v="2"><img src="images/hot-brandgroup/2.jpg"><br>
				<span id="sp_2">丰田</span></li>

				<li v="3"><img src="images/hot-brandgroup/3.jpg"><br>
				<span id="sp_3">福特</span></li>

				<li v="4"><img src="images/hot-brandgroup/4.jpg"><br>
				<span id="sp_4">现代</span></li>

				<li v="5"><img src="images/hot-brandgroup/5.jpg"><br>
				<span id="sp_5">标致</span></li>

				<li v="6"><img src="images/hot-brandgroup/6.jpg"><br>
				<span id="sp_6">本田</span></li>

				<li v="7"><img src="images/hot-brandgroup/7.jpg"><br>
				<span id="sp_7">宝马</span></li>

				<li v="8"><img src="images/hot-brandgroup/8.jpg"><br>
				<span id="sp_8">吉利汽车</span></li>

				<li v="9"><img src="images/hot-brandgroup/9.jpg"><br>
				<span id="sp_9">奥迪</span></li>

				<li v="10"><img src="images/hot-brandgroup/10.jpg"><br>
				<span id="sp_10">奔驰</span></li>
			</ul>
		</div>
		<!--
    <h3>热门车型</h3>
    <div class="type-hotcargroup">
      <a href="#"><img src="images/hot-cargroup/1.jpg"><br>博越</a>
      <a href="#"><img src="images/hot-cargroup/2.jpg"><br>哈弗H7</a>
      <a href="#"><img src="images/hot-cargroup/3.jpg"><br>锐界</a>
      <a href="#"><img src="images/hot-cargroup/4.jpg"><br>汉兰达</a>
      <a href="#"><img src="images/hot-cargroup/5.jpg"><br>东南DX7</a>
      <a href="#"><img src="images/hot-cargroup/6.jpg"><br>思域</a>
      <a href="#"><img src="images/hot-cargroup/7.jpg"><br>长安CS75</a>
      <a href="#"><img src="images/hot-cargroup/8.jpg"><br>艾瑞泽5</a>
    </div>
  </div>
  -->
		<div class="listBrand">
			<h3 id="jump-A">A</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">阿斯顿·马丁</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">安凯客车</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">奥迪</strong></li>
			</ul>
			<h3 id="jump-B">B</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">巴博斯</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">宝骏</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">宝马</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">宝沃</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">保时捷</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北京</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北汽幻速</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北汽绅宝</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北汽威旺</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北汽新能源</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">北汽制造</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">奔驰</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">奔腾</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">本田</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">比亚迪</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">标致</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">别克</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">宾利</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">布加迪</strong></li>
			</ul>
			<h3 id="jump-C">C</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">昌河</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">长安</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">长安商用</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">长城</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">成功汽车</strong></li>
			</ul>
			<h3 id="jump-D">D</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">大众</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">道奇</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风风度</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风风光</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风风神</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风风行</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东风小康</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">东南</strong></li>
			</ul>
			<h3 id="jump-F">F</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">法拉利</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">菲亚特</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">丰田</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">福迪</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">福汽启腾</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">福特</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">福田</strong></li>
			</ul>
			<h3 id="jump-G">G</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">GMC</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">观致</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">光冈</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">广汽传祺</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">广汽吉奥</strong></li>
			</ul>
			<h3 id="jump-H">H</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">哈飞</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">哈弗</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">海格</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">海马</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">悍马</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">恒天</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">红旗</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华凯</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华利</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华普</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华颂</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华泰</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">华泰新能源</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">黄海</strong></li>
			</ul>
			<h3 id="jump-J">J</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">Jeep</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">吉利汽车</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">江淮</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">江铃</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">江铃集团轻汽</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">捷豹</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">金杯</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">金龙</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">金旅</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">九龙</strong></li>
			</ul>
			<h3 id="jump-K">K</h3>
			<ul class="brandgroup">
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">KTM</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">卡尔森</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">卡升</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">卡威</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">开瑞</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">凯迪拉克</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">凯翼</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">康迪</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">科尼塞克</strong></li>
				<li id="" v=""><img src="images/brandgroup/1.jpg"><strong
					id="">克莱斯勒</strong></li>
			</ul>
			<h3 id="jump-L">L</h3>

			<h3 id="jump-M">M</h3>
			<h3 id="jump-N">N</h3>
			<h3 id="jump-O">O</h3>
			<h3 id="jump-P">P</h3>
			<h3 id="jump-Q">Q</h3>
			<h3 id="jump-R">R</h3>
			<h3 id="jump-S">S</h3>
			<h3 id="jump-T">T</h3>
			<h3 id="jump-U">U</h3>
			<h3 id="jump-V">V</h3>
			<h3 id="jump-W">W</h3>
			<h3 id="jump-X">X</h3>
			<h3 id="jump-Y">Y</h3>
			<h3 id="jump-Z">Z</h3>
		</div>
		<div class="jump-tag">
			<ul class="jump-ul">
				<li class="jump-li" data-view="jump-A">A</li>
				<li class="jump-li" data-view="jump-B">B</li>
				<li class="jump-li" data-view="jump-C">C</li>
				<li class="jump-li" data-view="jump-D">D</li>
				<li class="jump-li" data-view="jump-F">F</li>
				<li class="jump-li" data-view="jump-G">G</li>
				<li class="jump-li" data-view="jump-H">H</li>
				<li class="jump-li" data-view="jump-J">J</li>
				<li class="jump-li" data-view="jump-K">K</li>
				<li class="jump-li" data-view="jump-L">L</li>
				<li class="jump-li" data-view="jump-M">M</li>
				<li class="jump-li" data-view="jump-N">N</li>
			</ul>
			<div class="jump-tips"></div>
		</div>
</body>
</html>
