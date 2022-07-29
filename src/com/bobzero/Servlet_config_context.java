package com.bobzero;

/*must import*/
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet_config_context extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.print(" hello <br>");
		
		ServletContext ctx = getServletContext();
		/*this wiill give you the value of the attribute you specify*/
		String str = ctx.getInitParameter("name");
		
		/*displaying results*/
		out.println(str);
		
		 
		
		
	}

}
