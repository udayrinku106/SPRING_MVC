<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='https://github.com/apple-touch-icon-57x57.png' rel='icon' type='image/x-icon'/>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<style>
body {
	width: 1000px;
	margin: 0 auto;
	border: 2px solid #000;
	overflow: hidden;
}

.view {
	background: red;
}

.content,.sidebar {
	color: #fff;
}

.sidebar a {
	color: #fff;
	text-decoration: none;
}

.header {
	height: 100px;
	background: yellow;
}

h1,h3 {
	margin-top: 0px;
}

.sidebar {
	width: 20%;
	float: left;
}

.content {
	width: 79%;
	float: left;
	border: 2px solid #000;
	background: #FE6F33;;
	margin-left: 4px;
}

.footer {
	clear: both;
	background: green;
	height: 100px;
	color: #fff;
	text-align: center;
}
</style>
</head>
<body>
	<div class="view">
		<div class="header">
			<tiles:insertAttribute name="header" />
		</div>

		<div class="sidebar">
			<tiles:insertAttribute name="menu" />
		</div>

		<div class="content">
			<tiles:insertAttribute name="body" />
		</div>
		<br />
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>