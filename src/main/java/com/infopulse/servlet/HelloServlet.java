package com.infopulse.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String value = null;
//        Cookie[] cookies = request.getCookies();
//        for(Cookie cookie:cookies){
//            if(cookie.getName().equals("uname")){
//                value=cookie.getValue();
//                break;
//            }
//        }
//        if(value == null){
//            value = request.getParameter("username");
//            Cookie cookie = new Cookie("uname", value);
//            cookie.setMaxAge(1000);
//            response.addCookie(cookie);
//        }
        HttpSession hs = request.getSession(true);
        value=(String)hs.getAttribute("uname");

        if(value == null){
            value = (String)request.getAttribute("filter");
            hs.setAttribute("uname", value);
            hs.setMaxInactiveInterval(100);
        }

        request.setAttribute("user",value);
        //RequestDispatcher rd = getServletConfig().getServletContext().getContext("/mydirectory").getRequestDispatcher("/aaa");
        RequestDispatcher rd = request.getRequestDispatcher("/output");
        rd.forward(request, response);
    }

}
