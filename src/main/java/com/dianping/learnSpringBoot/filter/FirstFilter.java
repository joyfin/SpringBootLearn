package com.dianping.learnSpringBoot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("filter 初始化，in FirstFilter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("filter 执行过滤，in FirstFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("filter 销毁，in FirstFilter");
    }

}
