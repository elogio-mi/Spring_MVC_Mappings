<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3</h1>
	
	<form:form modelAttribute = "test3bean" action = "result">
		<form:input path = "id"  placeholder = "id"/>
		<form:input path = "name" placeholder = "name"/>
		<form:password path = "pw" placeholder = "password" showPassword = "true"/>
		<form:button> OK</form:button>
	</form:form>
	
	
</body>
</html>