package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstServlet implements Servlet { // Implement is used because Servlet is Interface

	ServletConfig conf;  // Defining ServletConfig variable as conf
	
	
	//********** Life cycle methods **********
	// We have to override three methods i.e. init(), service(), destroy()
	public void init (ServletConfig conf) // init method for Initialization of servlet object
	
	{
	   System.out.println("creating object: ......");
	}
	
	// service method throws two exception
	public void service (ServletRequest req, ServletResponse resp)throws ServletException, IOException
	{
		System.out.println("Servicing......."); // This message means logic is getting processed
		                                        // Any request is processed by this method
	// Set the content type of the response
		resp.setContentType("text/html"); // Output Response will go to browser & Browser understands html only
		
		// PrintWriter for printing on the web page
		PrintWriter out = resp.getWriter(); // out is variable here
		out.println("<h1> This is my output from servlet method:</h1>");
		// Dynamic Generated date is converted to String
		out.println("<h1> Today's Date & Time is "+new Date().toString()+"</h1>");
	
	}                                           
	
	public void destroy() // destroy method for destroying servlet object
	
	{
		System.out.println("Going to destroy servlet object");
	}
	
	// ********** Non life cycle methods **********
	// Below methods are not running by server
	//Below methods are only executed when called
	public ServletConfig getServletConfig()
	
	{
		return this.conf;
	}
	
	public String getServletInfo()
	
	{
		return "this servlet is created by Ankit Thakur";
	}
	
}

// Our Servlet is ready
// For Executing this servlet, mapping will be done in web.XML file


