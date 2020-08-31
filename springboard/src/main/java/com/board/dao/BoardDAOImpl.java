package com.board.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board";
	
	@Override
	public List list() throws Exception {
		
		return sql.selectList(namespace + ".list");
	}

	@Override
	public void write(Board vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);
		
	}

	@Override
	public Board view(int bno) throws Exception {
		
		return sql.selectOne(namespace + ".view", bno);
	}

	@Override
	public void modify(Board vo) throws Exception {

		sql.update(namespace + ".modify", vo);
		
	}

	@Override
	public void delete(int bno) throws Exception {
		
		sql.delete(namespace + ".delete", bno);
		
	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".count");
	}

	// 게시물 목록 + 페이징
	@Override
	public List listPage(int displayPost, int postNum) throws Exception {

		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
	  
		return sql.selectList(namespace + ".listPage", data);
	}

}
 