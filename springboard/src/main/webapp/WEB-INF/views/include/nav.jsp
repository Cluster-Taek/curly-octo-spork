<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1 style="text-align: center;">게시판</h1>
<p style="text-align: center;">
	<button type="button" onclick="location.href='/board/write'">글 작성</button>
	<button type="button" onclick="location.href='/board/listPage?num=1'">글 목록</button>
	<button type="button" onclick="location.href='/board/search?num=1&&keyword=1'">글 검색</button>
</p>
