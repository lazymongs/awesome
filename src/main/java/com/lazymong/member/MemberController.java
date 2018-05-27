package com.lazymong.member;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@Autowired
	MemberRepository rep;
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		List<Member> list = rep.findAll();
		model.addAttribute("list", list);
		
		return "member/list";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		
		List<Member> list = rep.findAll();
		model.addAttribute("list", list);
		
		return "member/signup";
	}

	@RequestMapping(value="/register",  method = RequestMethod.POST)
	@ResponseBody
	public String register(@RequestBody Member member) {
		
		rep.save(member);
		
		return "cool";
	}
	
}
