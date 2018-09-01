package com.kren.simplespingmvc.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.CharacterEncodingFilter;

//@WebFilter(urlPatterns = "/config-1/test")
public class CustomCharacterEncodingFilter extends CharacterEncodingFilter {

    public CustomCharacterEncodingFilter() {
	super(StandardCharsets.UTF_8.name(), true, true);
    }

    @Override
    public final void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
	System.out.println(CustomCharacterEncodingFilter.class.getName() + " BEFORE REQUEST");
	System.out.println(CustomCharacterEncodingFilter.class.getName() + " " + request.getCharacterEncoding());

	super.doFilterInternal(request, response, filterChain);

	System.out.println(CustomCharacterEncodingFilter.class.getName() + " AFTER RESPONSE");
	System.out.println(CustomCharacterEncodingFilter.class.getName() + " " + response.getCharacterEncoding());

    }

}
