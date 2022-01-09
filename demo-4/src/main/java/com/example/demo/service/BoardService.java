package com.example.demo.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	  List<Map<String, Object>> getBoards();
	  
	  String insertBoards();
}


