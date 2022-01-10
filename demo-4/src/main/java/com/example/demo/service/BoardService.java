package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.BoardForm;

public interface BoardService {
	  List<Map<String, Object>> getBoards();
	  
	  void insertBoards(BoardForm form);
}


