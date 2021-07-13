<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/insert.do" method="post">
<table>
	<tr>
		<td>번호</td>
		<td><input type="number" name="boardNb"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="boardName"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><input type="text" name="boardTitle"></td>
	</tr>
</table>
<button type="submit">등록</button>
</form>
<br>
<a href="/select.do"><button>리스트</button></a>
</body>
</html>