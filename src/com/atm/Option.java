package com.atm;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Option extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String staff=request.getParameter("staff");
		String customer=request.getParameter("customer");
		
	 if(staff.contentEquals("Coporate SignUp/ Login"))
		{
			response.sendRedirect("corporatesignup.jsp");
		}
	}


}
