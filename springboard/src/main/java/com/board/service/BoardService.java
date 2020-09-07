package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.Board;

@Service
public class BoardService {
	
	@Inject
	private BoardDAO dao;
	
	//게시물 목록
	public List<Object> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

	// 게시물 작성
	public void write(Board vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
		
	}

	//게시물 조회
	public Board view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

	public void modify(Board vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
		
	}

	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	public int count() throws Exception {
		// TODO Auto-generated method stub
		return dao.count();
	}

	public List<Object> listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		return dao.listPage(displayPost, postNum);
	}
	
	public List<Object> search(int displayPost, int postNum, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.search(displayPost, postNum, keyword);
	}

}
 