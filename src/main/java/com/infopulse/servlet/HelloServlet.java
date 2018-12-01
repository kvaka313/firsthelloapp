package com.infopulse.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String value = request.getParameter("username");
        request.setAttribute("user",value);
        //RequestDispatcher rd = getServletConfig().getServletContext().getContext("/mydirectory").getRequestDispatcher("/aaa");
        RequestDispatcher rd = request.getRequestDispatcher("/output");
        rd.forward(request, response);
    }

}
