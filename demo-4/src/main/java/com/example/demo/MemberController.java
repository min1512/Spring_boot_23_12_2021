package com.example.demo;

import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.MemberForm;
import com.example.demo.service.MemberService;

@Controller
public class MemberController {
  
	  @Autowired
	  private MemberService memberservice;
	  
	  @GetMapping("/logout")
	  public void logout( HttpServletRequest request ) {
		  HttpSession session = request.getSession();
		  session.invalidate();// 세션 날림
	  }
		
	  @GetMapping("/login")
	  public String LoginForm(@ModelAttribute MemberForm memberForm, HttpServletRequest request ) {
		  HttpSession session = request.getSession();
		  
		  Object memberSession = session.getAttribute("member");
		  
		  System.out.println("getPage");
		  System.out.println(memberSession);
		  
		  if(Objects.nonNull(memberSession)) {
			  return "redirect:/board";
		  }
		  
		  return "login";
	  }  
	  
	  @PostMapping("/login")
	  public String login(MemberForm form, HttpServletRequest request) {
	  
		  boolean result = memberservice.validationLogin(form.getMemberid(), form.getMemberpw());
		  
		  if(result) {
			  // 로그인 성공
			  HttpSession session = request.getSession();
			  
			  MemberForm member =memberservice.selectById(form.getMemberid());			  
			  System.out.println(member);
			  
			  session.setAttribute("member", member.getMemberid());
			  
			  return "redirect:/board";
		  }
		  
	  	  
		  return "redirect:/login";
	  }
	  
	  @GetMapping("/signup")
	  public String SignUpForm(@ModelAttribute MemberForm memberForm ) {
		  return "signup";
	  }
	  
	  @PostMapping("/signup")
	  public String signup(MemberForm form) {
		  memberservice.insertMembers(form);
		  return "redirect:/login";
	  }
	  
	  @PostMapping("/signup/ckIdValue")
	  public String ckIdValue(MemberForm form, @RequestParam Map<String, Object> paramMap ) {
		  System.out.println(paramMap.get("id").toString());
		  //memberservice.insertMembers(form);
		  return "/signup :: #commentTable";
	  }
  
}
