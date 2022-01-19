package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import application.MRA_App;


/**
 * Contains GUI for staffmember
 * 
 * @author swe.uni-due.de
 *
 */
public class UserGUI extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * doGet contains the insertOffer form
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
 
		request.setAttribute("navtype", "user");
		request.setAttribute("pagetitle", "register");

		// Dispatch request to template engine
		try {
			request.getRequestDispatcher("/templates/defaultWebpageU.ftl").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Contains handling of insertOffer call
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("navtype", "user");

		// Check wether the call is insertOffer or not
		if (request.getParameter("action").equals("register")) {

			// Append parameter of request
			String name = (String) request.getParameter("name");
			String agestr = (String) request.getParameter("age");
			int age=Integer.parseInt(agestr);
			String email = (String) request.getParameter("email");
			
		  
			if(new MRA_App().requestRegistration(name, age, email)==true) {
 
		   try {
	 		    request.setAttribute("pagetitle", "register");
			    request.setAttribute("message", "Register OK");
				request.getRequestDispatcher("/templates/okRepresentation.ftl").forward(request, response);

			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}}
			
			if(new MRA_App().requestRegistration(name, age, email)==false) {
				 
				   try {
			 		    request.setAttribute("pagetitle", "register");
					    request.setAttribute("message", "Registration failure:Age must over 18");
						request.getRequestDispatcher("/templates/failInfoRepresentation.ftl").forward(request, response);

					} catch (ServletException | IOException e) {
						e.printStackTrace();
					}}
			
					
			// Call doGet if request is not equal to insertOffer
		} else
			doGet(request, response);

	}
}