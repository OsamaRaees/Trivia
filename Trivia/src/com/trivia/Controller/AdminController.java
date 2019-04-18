package com.trivia.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trivia.Dao.IMethods;
import com.trivia.Dao.MethodImpl;
import com.trivia.Model.Admin;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private MethodImpl dao;
    public AdminController() {
        dao = new MethodImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("list", dao.getAllAdmins());
		request.getRequestDispatcher("PreWelcome.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin admin = new Admin();
		HttpSession sessions;
		String actions = request.getParameter("submit");
		if(actions.equals("register")) {
			String id = request.getParameter("AdminId");
			String contact = request.getParameter("AContact");
			String postal = request.getParameter("Apostal");
			admin.setId(Integer.parseInt(id));
			admin.setPassword(request.getParameter("APassword"));
			admin.setFirstName(request.getParameter("AFirstName"));
			admin.setLastName(request.getParameter("ALastName"));
			admin.setGender(request.getParameter("AGender"));
			admin.setContact(Integer.parseInt(contact));
			admin.setAddress(request.getParameter("Aaddress"));
			admin.setAreaResidence(request.getParameter("Aarea"));
			admin.setCity(request.getParameter("Acity"));
			admin.setPostalCode(Integer.parseInt(postal));
			admin.setCountry(request.getParameter("Acountry"));
			admin.setProfession(request.getParameter("Aprofession"));
			
			dao.AdminRegister(admin);
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
			if(rd != null) {
				rd.forward(request, response);
			}
       }
		
		else if(actions.equals("login")) {
			String id = request.getParameter("adminid");
			
			if(dao.AdminLogin(Integer.parseInt(id), request.getParameter("apassword"))) {
				sessions = request.getSession();
				sessions.setAttribute("adminid", Integer.parseInt(id));
			}
			
			else {
				PrintWriter out =response.getWriter();
				out.println("Invalid userName or Password");

		}
			
		doGet(request,response);
	}

}
}
