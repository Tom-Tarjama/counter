package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			session.setAttribute("count", 0);
			return "index.jsp";
		}else {
			count++;
			session.setAttribute("count", count);
			return "index.jsp";
		}
	}
	
	@RequestMapping("/your_server/counter")
	public String counter(Model model) {
		return "counter.jsp";
	}
	
	@RequestMapping("/your_server/double_count")
	public String dbl(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			session.setAttribute("count", 0);
			return "index.jsp";
		}else {
			count+=2;
			session.setAttribute("count", count);
			return "index.jsp";
		}
	}
	
	@RequestMapping("/your_server/reset_session")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "counter.jsp";
	}
	
	@RequestMapping("/your_server/kill_session")
	public String kill(HttpSession session) {
		session.invalidate();
		return "counter.jsp";
	}
}
