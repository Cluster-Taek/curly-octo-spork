<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
<style type="text/css">
	a, a:hover {
		color : #000000;
		text-decoration : none;
	}
</style>
</head>
<body>

	<div id="nav">
		<%@ include file="../include/nav.jsp" %>
	</div>
	<form method="post">
		<table style="width:100%; text-align: center; border: 1px solid #dddddd;">
			<tr >
				<th>제목</th>
				<td style="width:80%; text-align: left; border: 1px solid #dddddd;">${view.title}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td style="width:80%; text-align: left; border: 1px solid #dddddd;">${view.writer}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td style="width:80%; text-align: left; border: 1px solid #dddddd;">${view.content}</td>
			</tr>
		</table>
		<br/>
		<div style="text-align: center;">
			<button type="button" onclick="location.href='/board/modify?bno=${view.bno}'">수정</button>
			<button type="button" onclick="location.href='/board/delete?bno=${view.bno}'">삭제</button>
		</div>
	
	
</form>
</body>
</html>