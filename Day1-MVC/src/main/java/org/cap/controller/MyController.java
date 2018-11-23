package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	@RequestMapping("/hello")
	public ModelAndView sayHii() {
		
		return new ModelAndView("success", "msg", "Hii kjdfh");
	}

}
