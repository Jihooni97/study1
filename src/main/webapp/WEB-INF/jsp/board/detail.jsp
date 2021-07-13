<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<tr>
		<td>${data.number}</td>
		<td>${data.name}</td>
		<td>${data.title}</td>
	</tr>
</table>
<a href="/delete.do?nb=${data.number}"><button>삭제</button></a>
<a href="/updatePage.do?nb=${data.number}"><button>수정</button></a>
<a href="/select.do"><button>리스트</button></a>

</body>
</html>