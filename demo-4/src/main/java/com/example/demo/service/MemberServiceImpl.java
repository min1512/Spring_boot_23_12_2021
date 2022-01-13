package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MemberForm;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
  @Autowired
  private MemberRepository memberRepository;
  
  @Autowired
  private PasswordEncoder passwordEncoder;
  
  @Override
  public void insertMembers(MemberForm form) {
	  String encodedPassword = passwordEncoder.encode(form.getMemberpw());
	  form.setMemberpw(encodedPassword);
	  memberRepository.insertMembers(form);
  }
  
  @Override
  public boolean validationLogin(String email, String password) {
	  MemberForm loginUser = memberRepository.findByEmail(email);
	  
	  System.out.println(email);
	  System.out.println(password);
	  System.out.println(loginUser);	  
	  
	  if(loginUser==null) {
		  System.out.println("해당 이메일의 유저가 존재하지 않습니다.");		  
		  return false;
	  }
	  
	  if(! passwordEncoder.matches(password, loginUser.getMemberpw() ) ) {
		  System.out.println("비밀번호가 일치하지 않습니다.");
		  return false;
	  }
	  
	  System.out.println("로그인 성공");
	  
	  return true;
  }
}
