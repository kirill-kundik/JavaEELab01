package com.kundikprojects;

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;


public class Main extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        Object title = "Proverka na Odmena";
        request.setAttribute("title", title);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        System.out.println(login);
        System.out.println(pass);

        String url = "/hello.jsp";
        Object data;
        Object title;

        if (login.equals("admin") && pass.equals("admin")) {
            title = "Welcome Admin!";
            data = "Tyt Odmen";
        } else {
            title = "Not welcome you!";
            data = "Ty ne odmen";
        }

        request.setAttribute("data", data);
        request.setAttribute("title", title);

        request.getRequestDispatcher(url).forward(request, response);

    }

}