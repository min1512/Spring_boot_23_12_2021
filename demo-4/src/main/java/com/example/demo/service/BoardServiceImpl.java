package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
  @Autowired
  private BoardRepository boardRepository;

  @Override
  public List<Map<String, Object>> getBoards() {
    return boardRepository.getBoards();
  }
  
  @Override
  public String insertBoards() {
    return boardRepository.insertBoards();
  }
}
