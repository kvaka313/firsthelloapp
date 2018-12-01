package com.infopulse.filter;

import javax.servlet.*;
import java.io.IOException;

public class OtherRequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String value= (String)request.getAttribute("filter");
        value+=" from other filter";
        request.setAttribute("filter", value);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
