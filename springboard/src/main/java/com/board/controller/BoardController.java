package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.Board;
import com.board.domain.Page;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService service;
	
	//게시물 작성
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		
		
	}
	
	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(Board vo) throws Exception {
	  service.write(vo);
	  
	  return "redirect:/board/listPage?num=1";
	}
	
	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("bno") int bno, Model model) throws Exception {
		
		Board vo = service.view(bno);
		
		model.addAttribute("view", vo);
		
	}
	
	//게시물 수정
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("bno") int bno, Model model) throws Exception {
		
		Board vo = service.view(bno);
		
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postModify(Board vo) throws Exception {
	  
		service.modify(vo);
	  
		return "redirect:/board/view?bno=" + vo.getBno();
	}

	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("bno") int bno) throws Exception {
	  
		service.delete(bno);
	  
		return "redirect:/board/listPage?num=1";
	}
	
	// 게시물 목록 + 페이징 추가
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void getListPage(Model model, @RequestParam("num") int num) throws Exception {
		Page page = new Page();
		
		page.setNum(num);
		page.setCount(service.count());  

		List<Object> list = null; 
		list = service.listPage(page.getDisplayPost(), page.getPostNum());

		model.addAttribute("list", list);   
		
		model.addAttribute("page", page);

		model.addAttribute("select", num);
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public void getSearch(Model model, @RequestParam("num") int num, @RequestParam("keyword") String keyword) throws Exception {
		Page page = new Page();
		
		page.setNum(num);
		page.setCount(service.count());  

		List<Object> list = null; 
		list = service.search(page.getDisplayPost(), page.getPostNum(), keyword);

		model.addAttribute("list", list);   
		
		model.addAttribute("page", page);

		model.addAttribute("select", num);
	}
	

}
