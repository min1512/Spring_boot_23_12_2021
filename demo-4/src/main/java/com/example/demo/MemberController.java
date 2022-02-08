package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	  @ResponseBody//이거를 안넣어서... 계속 500에러가 떨어졌네요..
	  public Map<String,String> ckIdValue(MemberForm form, @RequestParam Map<String, Object> paramMap, Model model ) {
		  
		  Map<String,String> map = new HashMap<String,String>();
		  
//		  map.put("dog", "강아지");
//		  map.put("cat", "고양이");
		  
		  //System.out.println(paramMap.get("id").toString());
		  
		  //model.addAttribute("id", paramMap.get("id").toString() );
		  
		  MemberForm member = memberservice.selectById(paramMap.get("id").toString());		  
		  //System.out.println(member);
		  
		  Object memberIdCk = member;
		  
		  
		  map.put("status", "200");
		  
		  if(paramMap.get("id").toString() == "") {
			  map.put("ckStatus", "fail");
			  map.put("message", "아이디를 입력 하세요.");
		  }else {
			  if(Objects.nonNull(memberIdCk)) {
				  map.put("ckStatus", "fail");
				  map.put("message", "이미사용중인 아이디 입니다.");
				  //model.addAttribute("message","이미사용중인 아이디 입니다.");
				  //System.out.println("사용 불가");
			  }else {
				  map.put("ckStatus", "success");
				  map.put("message", "사용 가능한 아이디 입니다.");
				  //model.addAttribute("message","사용 가능한 아이디 입니다.");
				  //System.out.println("사용 가능");
			  }
		  }

		  return map;
	  }
}
