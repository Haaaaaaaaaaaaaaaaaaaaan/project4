package com.bc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bc.frame.Service;
import com.bc.vo.UsersVO;

@Component
public class MainController {

	@Resource(name="uservice")
	Service<UsersVO, String> uservice;
	
	//Ȩ
	@RequestMapping("main.bc")
	public String main() {
		return "main";
	}
	
	//���񺸱�
	@RequestMapping("codelist.bc")
	public ModelAndView codelist() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage","codelist");
		return mv;
	}
	
	//qna������
	@RequestMapping("qna.bc")
	public ModelAndView qna() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage","qna");
		return mv;
	}
	
	//login������
	@RequestMapping("login.bc")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage","login");
		return mv;
	}
	
	//loginimpl
	@RequestMapping("loginimpl.bc")
	public ModelAndView loginimpl(HttpServletRequest request) {
		return null;
	}
	
	//�α׾ƿ�
	@RequestMapping("/logout.hw")
	public ModelAndView logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage", "center");
		return mv;
	}
	
	//ȸ������ ������
	@RequestMapping("register.bc")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("centerpage","register");
		return mv;
	}
	
	//registerimpl
	@RequestMapping("registerimpl.bc")
	public ModelAndView registerimpl(UsersVO user) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		try {
			uservice.register(user);
			mv.addObject("centerpage", "registerok");
		} catch (Exception e) {
			mv.addObject("centerpage", "registerfail");
			e.printStackTrace();
		}

		return mv;
	}
	
}
