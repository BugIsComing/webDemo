package com.lc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器，对每一个request做过滤
 *
 * @author
 * @date 2018年12月19日14:53:29
 */
public class HttpRequestFilter implements Filter {
    public HttpRequestFilter() {
        super();
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        System.out.println(req.getMethod());
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
