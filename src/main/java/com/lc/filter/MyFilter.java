package com.lc.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * 用于测试的过滤器
 *
 * @author
 * @date 2018年12月19日15:00:25
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("This is a test filter");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
