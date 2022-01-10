package com.example.demo;

import java.util.List;
import java.util.Map;

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
	  model.addAttribute("board","게시판");
	  return "board";
  }
  
  @GetMapping("/board/insert")
  public String boardInsert(Model model) {
	  model.addAttribute("board","게시판");
	  return "boardInsert";
  }
  
  @PostMapping("/board/insert")
  public String createBoard(BoardForm form) {
	  System.out.println(form.toString());
	  boardService.insertBoards(form);
	  return "redirect:/board/insert";
  }
  
  @GetMapping("/v1/board")
  public List<Map<String, Object>> getBoards() {
    return boardService.getBoards();
  }
}
