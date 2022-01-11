package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BoardForm;

@Mapper
@Repository
public interface MemberRepository {
  List<Map<String, Object>> getBoards();
  
  void insertBoards(BoardForm form);
}
