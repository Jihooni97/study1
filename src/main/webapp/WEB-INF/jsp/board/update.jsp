<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/update.do" method="post">
<table>
	<tr>
		<td>번호</td>
		<td><input type="number" name="boardNb" value="${data.number}" readonly></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="boardName" value="${data.name}"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><input type="text" name="boardTitle" value="${data.title}"></td>
	</tr>
</table>
<button type="submit">완료</button>
</form>
</body>
</html>