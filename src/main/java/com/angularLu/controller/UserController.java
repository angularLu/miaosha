package com.angularLu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/get")
	public void getUser(@RequestParam(name="id") Integer id){
		
	}

}
