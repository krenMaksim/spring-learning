package com.kren.simplespingmvc.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Config1RestController {

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
	System.out.println(Config1RestController.class.getName() + " " + request.getCharacterEncoding());
	System.out.println(Config1RestController.class.getName() + " /test");
	System.out.println(Config1RestController.class.getName() + " " + response.getCharacterEncoding());
	return "test";
    }
}