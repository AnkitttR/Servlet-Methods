package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

// Generic Servlet is child of servlet
// HttpServlet is child of GenericServlet
public class httpservlet extends HttpServlet // httpservlet class extends (inherit) properties of HttpServlet class
{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

System.out.println("This is get method...........");
response.setContentType("text/html"); // Hum response mein apne system se html type ka text bhejna chahte hain.
PrintWriter out = response.getWriter();
out.println("<h1>This is get method of My Servlet</h1>");
}
}
