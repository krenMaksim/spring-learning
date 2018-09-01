package com.kren.simplespingmvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns = WebInitializer.URL_PATTERN)
public class ForTestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	System.out.println(ForTestFilter.class.getName() + " BEFORE REQUEST");
	System.out.println(ForTestFilter.class.getName() + " " + request.getCharacterEncoding());

	chain.doFilter(request, response);

	System.out.println(ForTestFilter.class.getName() + " AFTER RESPONSE");
	System.out.println(ForTestFilter.class.getName() + " " + response.getCharacterEncoding());
    }

    @Override
    public void destroy() {
    }

}
