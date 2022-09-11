package com.example.TestJava.Config;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        javax.servlet.Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        javax.servlet.Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println(
                httpServletRequest.getRequestURI()
        );
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
