<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>내용</td>
	</tr>
<c:forEach items="${result}" var="a">
	<tr>
		<td><a href="/detailPage.do?nb=${a.number}"> ${a.number}</a></td>
		<td>${a.name}</td>
		<td>${a.title}</td>
	</tr>
</c:forEach>
</table>
<a href="/insertPage.do"><button>등록페이지</button></a>
</body>
</html>