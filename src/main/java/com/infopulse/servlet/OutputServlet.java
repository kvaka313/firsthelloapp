package com.infopulse.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class OutputServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession hs = request.getSession();
        List<Integer> lists =new ArrayList<>();
        lists.add(10);
        lists.add(20);
        hs.setAttribute("lists", lists);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/answer.jsp");
        rd.forward(request, response);


    }
}
