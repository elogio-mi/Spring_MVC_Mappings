<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> result</h1>
	<span>${requestScope.dataBean.id}</span><br/>
	<span>${requestScope.dataBean.name}</span><br/>
	<span>${requestScope.dataBean.pw}</span><br/>
	<br/>
	<br/>
	<br/>
	<span>${requestScope.test3Bean.id}</span><br/>
	<span>${requestScope.test3Bean.name}</span><br/>
	<span>${requestScope.test3Bean.pw}</span><br/>
</body>
</html>