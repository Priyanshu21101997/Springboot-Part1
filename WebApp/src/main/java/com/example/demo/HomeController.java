package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	// Old code
//	@RequestMapping("home")
//	public String home(String name, HttpSession session) {
//		
////		HttpSession session = req.getSession(); // Pass session to jsp http://localhost:8080/home?name=Priyanshu
////		String name = req.getParameter("name");
//		System.out.println("hi " + name);
//		session.setAttribute("name", name); // Key value pair
//		return "home"; // We have removed .jsp here as we have set suffix in propertires file
//	}
	
	//ModelView Code
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		
//		return mv;
//	}
	
	// Accepting Complete Object
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		
		return mv;
	}
	

}
