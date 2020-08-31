package com.board.dao;

import java.util.List;
import com.board.domain.Board;

public interface BoardDAO {
	
	//게시물 등록
	public List list() throws Exception;
	
	//게시물 작성
	public void write(Board vo) throws Exception;

	//게시물 조회
	public Board view(int bno) throws Exception;

	//게시물 수정
	public void modify(Board vo) throws Exception;
	
	//게시물 삭제
	public void delete(int bno) throws Exception;
	
	//게시물 총 갯수
	public int count() throws Exception;
	
	// 게시물 목록 + 페이징
	public List listPage(int displayPost, int postNum) throws Exception;
}
