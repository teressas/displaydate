<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time Dashboard</title>

<link rel="stylesheet" href="/css/style.css"/>


</head>
<body>
	<div class="container">
		<div class="row">
			<div class="left">
				<a href="/date" class="link-primary d-flex p-2 bd-highlight" onclick="date()">Date Template</a>
			</div>
		
			<div class="right">
				<a href="/time" class="link-primary d-flex p-2 bd-highlight" onclick="time()">Time Template</a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/main.js"></script>
</html>