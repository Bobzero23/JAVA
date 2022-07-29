package com.bobzero;

import java.io.IOException;
import java.io.PrintWriter;

/*must import*/
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Square_servlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/*declara the session*/
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		
		/*just incase you wanna delete the k*/
		//like after user logged in delete the link or anything
		//session.removeAttribute("k");
		
		/*calculation*/
		k = k * k;
		
		/*receiving an object from another servlet*/
		/*it's object so I parse it to integer*/
		//int k = (int) req.getAttribute("k");
		

		
		PrintWriter out = res.getWriter();
		out.println("The square is: " + k);
	}
}
