package com.company.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Yevhen on 08.07.2016.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String title = "Using " + request.getMethod() + " method to read from form data";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<u1>\n" +
                "    <li><b>First Name</b>: " + request.getParameter("first_name") + "\n" +
                "    <li><b>Last Name</b>: " + request.getParameter("last_name") + "\n" +
                "</u1>\n" +
                "</body></html>");
    }
}
