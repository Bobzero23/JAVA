package com.bobzero;

/*must import*/
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
/*these imports is a must */
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/*the class which will behave as a servlet*/
@SuppressWarnings({ "serial", "unused" })
public class Add_servlet extends HttpServlet {

	/*this method is also a must*/
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		/*here is how we deal with the request*/
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		/*calculation*/
		int k = i + j;
		
		
		/*now lets use http session*/
		HttpSession session = req.getSession();
		
		/*pass the session values*/
		session.setAttribute("k", k);
		
		/*sending a value to another servlet*/
		res.sendRedirect("sq");
		
		//req.setAttribute("k", k);
		
		/*here is how we deal with the response*/
		//PrintWriter out = res.getWriter();
		//out.println("The answer is: " + k);
		
		/*here we call anther servlet*/
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		/*we also have to send this two objcets*/
		//rd.forward(req, res);
		
		
	}

}
