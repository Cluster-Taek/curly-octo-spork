package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.Board;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	//게시물 목록
	@Override
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

	// 게시물 작성
	@Override
	public void write(Board vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
		
	}

	//게시물 조회
	@Override
	public Board view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

	@Override
	public void modify(Board vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
		
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public List listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		return dao.listPage(displayPost, postNum);
	}

}
 