package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MemberForm;

@Mapper
@Repository
public interface MemberRepository {
  List<Map<String, Object>> getBoards();
  
  void insertMembers(MemberForm form);
  
  void updateMembers(MemberForm form);
  
  MemberForm selectById(String email);
  
  MemberForm findByEmail(String email);
}
