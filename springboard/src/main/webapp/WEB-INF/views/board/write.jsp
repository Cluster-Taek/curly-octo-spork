<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
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
				<td style="width:80%; border: 1px solid #dddddd;"><input style="width:100%;" type="text" name="title"/></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td style="width:80%; border: 1px solid #dddddd;"><input style="width:100%;" type="text" name="writer"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td style="width:80%; border: 1px solid #dddddd;"><textarea style="width:100%;" cols="50" rows="5" name="content"></textarea></td>
			</tr>
		</table>
		<br/>
		<button type="submit">작성</button>	
	</form>
</body>
</html>