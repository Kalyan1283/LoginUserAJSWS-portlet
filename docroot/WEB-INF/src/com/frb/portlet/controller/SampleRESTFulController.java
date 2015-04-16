package com.frb.portlet.controller;

import com.frb.portlet.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SampleRESTFulController {

	@RequestMapping(value = "/welcomeMessage", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String helloSample() {
		System.out.println("Inside helloSample");
		return "Welcome to Spring Restful Services.";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody String loginAction(@RequestBody User user) {
		System.out.println("Username:"+user.getUserName());
		System.out.println("password:"+user.getPassword());
		
		return "Welcome to Spring Restful Services.";
	}
}
