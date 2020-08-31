package com.board.service;

import java.util.List;

import com.board.dao.BoardDAO;
import com.board.domain.Board;

public interface BoardService {

	public List<Board> list() throws Exception;
	
	public void write(Board vo) throws Exception;
	
	public Board view(int bno) throws Exception;
	
	public void modify(Board vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public int count() throws Exception;
	
	public List listPage(int displayPost, int postNum) throws Exception;
}
