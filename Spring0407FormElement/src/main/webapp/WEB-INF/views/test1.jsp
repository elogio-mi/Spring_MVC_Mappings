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
	
	<form:form modelAttribute = "dataBean" action = "result">
		
		hidden - <form:hidden path="b1"/> <br/>
		text - <form:input path="b2"/> <br/>
		password - <form:password path="b3" showPassword ="true"/> <br/>
		testarea - <form:textarea path="b4" /> <br/>
		
		<hr/>
		
		<form:select path = "b5">
			<form:options items = "${requestScope.b5 }" itemLabel ="key" itemValue ="value"/>
		</form:select>
		
	</form:form>
	
</body>
</html>