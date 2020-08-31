<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
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
	<table style="width:100%; text-align: center; border: 1px solid #dddddd;">
		<tr>
			<th style="background-color: #eeeeee; text-align: center;">번호</th>
			<th style="background-color: #eeeeee; text-align: center;">제목</th>
			<th style="background-color: #eeeeee; text-align: center;">작성자</th>
			<th style="background-color: #eeeeee; text-align: center;">작성일</th>
			
		</tr>
		
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td style="width:8%; border-bottom: 1px solid #dddddd;">${list.bno}</td>
					<td style="width:50%; border-bottom: 1px solid #dddddd;">
						<a href ="/board/view?bno=${list.bno}">${list.title}</a>
					</td>
					<td style="width:15%;border-bottom: 1px solid #dddddd;">${list.writer}</td>
					<td style="width:20%; border-bottom: 1px solid #dddddd;">
						<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${list.regDate}"/>
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div style=" text-align: center;">
		<c:if test="${page.prev}">
			<span>[ <a href="/board/listPage?num=${page.startPageNum - 1}">이전</a> ]</span>
		</c:if>
	
		<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}" var="num">
			<span>
			 	<c:if test="${select != num}">
			   		<a href="/board/listPage?num=${num}">${num}</a>
			  	</c:if>    
			  
			  	<c:if test="${select == num}">
			   		<b>${num}</b>
			  	</c:if>
			</span>
		</c:forEach>
	
		<c:if test="${page.next}">
			<span>[ <a href="/board/listPage?num=${page.endPageNum + 1}">다음</a> ]</span>
		</c:if>
	</div>
	
</body>
</html>