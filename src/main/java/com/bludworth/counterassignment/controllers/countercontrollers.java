package com.bludworth.counterassignment.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class countercontrollers {
	@RequestMapping("/")
    public String index(HttpSession session){
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count", (Integer) session.getAttribute("count")+1);
		}
    	return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession Session) {

		return "counter.jsp";
		
	}




}
