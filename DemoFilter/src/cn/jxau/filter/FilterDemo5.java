package cn.jxau.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//浏览器直接请求index.jsp资源时，该过滤器会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//只有转发访问index.jsp时，该过滤器才会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)

//浏览器直接请求index.jsp资源或者转发访问index.jsp时，过滤器都会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes ={DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo5...");

        chain.doFilter(request, response);
    }
}
