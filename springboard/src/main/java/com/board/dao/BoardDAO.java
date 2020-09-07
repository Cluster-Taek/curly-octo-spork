package com.board.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.Board;

@Repository
public class BoardDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.board.mappers.board";
	
	public List<Object> list() throws Exception {
		
		return sql.selectList(namespace + ".list");
	}

	public void write(Board vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);
		
	}

	public Board view(int bno) throws Exception {
		
		return sql.selectOne(namespace + ".view", bno);
	}

	public void modify(Board vo) throws Exception {

		sql.update(namespace + ".modify", vo);
		
	}

	public void delete(int bno) throws Exception {
		
		sql.delete(namespace + ".delete", bno);
		
	}

	public int count() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".count");
	}

	// 게시물 목록 + 페이징
	public List<Object> listPage(int displayPost, int postNum) throws Exception {

		HashMap data = new HashMap();
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
	  
		return sql.selectList(namespace + ".listPage", data);
	}
	
	public List<Object> search(int displayPost, int postNum, String keyword) throws Exception {

		HashMap<String, Object> data = new HashMap<String, Object>();
		
		data.put("displayPost", displayPost);
		data.put("postNum", postNum);
		data.put("keyword", keyword);
	  
		return sql.selectList(namespace + ".search", data);
	}

}
 