package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		MemberForm member = memberservice.selectById(memberSession);
		
		List<MemberForm> memberlist = new ArrayList<>(); 
		
		memberlist.add(
				new MemberForm(
						member.getIdx(),
						member.getMemberid(),
						member.getMemberpw(),
						member.getMembername(),
						member.getMemberbirthday(),
						member.getMemberphonetel(),
						member.getRegdate(
								)
						)
				);
		
		model.addAttribute("memberlist",memberlist);
		
		//System.out.println(memberlist);
		
		return "myinfo";		
	  }
	
	@PostMapping("/myinfoUpdate")
	public String myinfo(MemberForm memberform) {
		memberservice.updateMembers(memberform);
		
		return "redirect:/logout";
	}
	
}
