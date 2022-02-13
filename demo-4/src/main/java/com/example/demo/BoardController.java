package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.BoardForm;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {
  @Autowired
  private BoardService boardService;
  
  @GetMapping("/board")
  public String board(Model model) {
	  model.addAttribute("boardList",boardService.getBoards());
	  //System.out.println(boardService.getBoards());
	  return "board";
  }
  
  @GetMapping("/board/insert")
  public String boardInsert(Model model, HttpServletRequest request) {
	  HttpSession session = request.getSession();
	  
	  Object memberSession = session.getAttribute("member");
	  //System.out.println(memberSession);
	  
	  session.setAttribute("user", memberSession);
	  	  
	  return "boardInsert";
  }
  
  @PostMapping("/board/insert")
  public String createBoard(BoardForm form) {	  
	  //System.out.println(form.toString());	  
	  boardService.insertBoards(form);
	  return "redirect:/board";
  }
  
  @GetMapping("/v1/board")
  public List<Map<String, Object>> getBoards() {
    return boardService.getBoards();
  }
}
