package com.example.demo.service;

import com.example.demo.dto.MemberForm;

public interface MemberService {
	
	  boolean validationLogin(String email, String password);
	
	  void insertMembers(MemberForm form);
	  
	  MemberForm selectById(String email);
}


