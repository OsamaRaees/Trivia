package com.trivia.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trivia.Dao.MethodImpl;
import com.trivia.Model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private MethodImpl dao;
    public CustomerController() {
        dao = new MethodImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("lister", dao.getallCustomers());
		request.getRequestDispatcher("PreWelcome.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer admin = new Customer();
		HttpSession sessions;
		String actions = request.getParameter("submit");
		if(actions.equals("register")) {
			String id = request.getParameter("CustomerId");
			String contact = request.getParameter("cContact");
			String postal = request.getParameter("cpostal");
			admin.setId(Integer.parseInt(id));
			admin.setPassword(request.getParameter("cPassword"));
			admin.setFirstName(request.getParameter("cFirstName"));
			admin.setLastName(request.getParameter("cLastName"));
			admin.setGender(request.getParameter("cGender"));
			admin.setContact(Integer.parseInt(contact));
			admin.setAddress(request.getParameter("caddress"));
			admin.setAreaResidence(request.getParameter("carea"));
			admin.setCity(request.getParameter("ccity"));
			admin.setPostalCode(Integer.parseInt(postal));
			admin.setCountry(request.getParameter("ccountry"));
			admin.setProfession(request.getParameter("cprofession"));
			
			dao.CustomerRegister(admin);
			RequestDispatcher rd = request.getRequestDispatcher("CustomerLogin.jsp");
			if(rd != null) {
				rd.forward(request, response);
			}
       }
		
		else if(actions.equals("login")) {
			String id = request.getParameter("customerid");
			
			if(dao.AdminLogin(Integer.parseInt(id), request.getParameter("cpassword"))) {
				sessions = request.getSession();
				sessions.setAttribute("customerid", Integer.parseInt(id));
			}
			
			else {
				PrintWriter out =response.getWriter();
				out.println("Invalid userName or Password");

		}
			
		doGet(request, response);
	}

	}
}
