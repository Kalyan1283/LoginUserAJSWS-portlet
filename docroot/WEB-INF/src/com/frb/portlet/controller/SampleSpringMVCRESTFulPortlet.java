package com.frb.portlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("VIEW")
public class SampleSpringMVCRESTFulPortlet {

	@RequestMapping
	public String initRESTFulApp() {
		return "login";
	}

}
