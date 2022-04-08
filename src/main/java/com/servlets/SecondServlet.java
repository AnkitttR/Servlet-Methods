package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Iss method mein sirf service method ko override karna padega
// Jabki FirstSevlet class main, humne 5 methods ko override kiya tha, more time taking.
public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	System.out.println("This is servlet using generic servlet"); // For console output
	res.setContentType("text/html"); 
	PrintWriter out = res.getWriter(); // For writing on browser
	out.println("<h1>This is my second servlet using generic servlet</h1>");
	}

	// Kyunki ye ek servlet hai, hence we have to do mapping in web.xml file.
}
