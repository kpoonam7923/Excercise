package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//import org.springframework.stereotype.Controller;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("home")
	
//	public String home(HttpServletRequest req, HttpServletResponse res) 
//	{
//		//HttpSession session = req.getSession(); 
//		String name = req.getParameter("name");
//		System.out.println("Hello Page" + name);
//		//session.setAttribute("name", name);
//		
//		req.setAttribute("name", name);  // here "name" = key; name =value //Model i.e. data
//		return "home"; //View
//	}
	
	
	
//	// ModelAndView is a holder for a model and a view; it allows to return both model and view in one return value
//	public ModelAndView home(@RequestParam("name") String myName) 
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myName); //can also add multiple data
//		
//		mv.setViewName("home"); //jsp
//		return mv;
//	}
	
	//http://localhost:8080/home?id=1&pName=poonam
	public ModelAndView home(Person per) 
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", per);
		
		mv.setViewName("home"); //jsp
		return mv;
	}
}
