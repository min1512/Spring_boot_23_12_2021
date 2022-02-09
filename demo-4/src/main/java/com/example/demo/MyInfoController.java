package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dto.MemberForm;
import com.example.demo.service.MemberService;

@Controller
public class MyInfoController {
	@Autowired
	private MemberService memberservice;	
	
	@GetMapping("/myinfo")
	  public String myinfo(@ModelAttribute MemberForm memberForm, HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		String memberSession = (String) session.getAttribute("member");		
		//System.out.println(memberSession);
		//MemberForm member = memberservice.selectById(memberSession);
		//System.out.println(member);
		model.addAttribute("memberlist",memberservice.selectById(memberSession));
		return "myinfo";		
	  }
}
