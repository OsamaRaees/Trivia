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
import com.trivia.Model.Vendor;

/**
 * Servlet implementation class VendorCoontroller
 */
@WebServlet("/VendorCoontroller")
public class VendorCoontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MethodImpl dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorCoontroller() {
    	dao = new MethodImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("lister", dao.getAllVendor());
		request.getRequestDispatcher("PreWelcome.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Vendor admin = new Vendor();
		HttpSession sessions;
		String actions = request.getParameter("submit");
		if(actions.equals("register")) {
			String id = request.getParameter("VendorId");
			String contact = request.getParameter("vContact");
			String postal = request.getParameter("vpostal");
			admin.setId(Integer.parseInt(id));
			admin.setPassword(request.getParameter("vPassword"));
			admin.setFirstName(request.getParameter("vFirstName"));
			admin.setLastName(request.getParameter("vLastName"));
			admin.setGender(request.getParameter("vGender"));
			admin.setContact(Integer.parseInt(contact));
			admin.setAddress(request.getParameter("vaddress"));
			admin.setAreaResidence(request.getParameter("varea"));
			admin.setCity(request.getParameter("vcity"));
			admin.setPostalCode(Integer.parseInt(postal));
			admin.setCountry(request.getParameter("vcountry"));
			admin.setProfession(request.getParameter("vprofession"));
			admin.setCountry(request.getParameter("vcafeid"));
			
			dao.VendorRegister(admin);
			RequestDispatcher rd = request.getRequestDispatcher("VendorLogin.jsp");
			if(rd != null) {
				rd.forward(request, response);
			}
       }
		
		else if(actions.equals("login")) {
			String id = request.getParameter("VendorID");
			
			if(dao.VendorLogin(Integer.parseInt(id), request.getParameter("vpassword"))) {
				sessions = request.getSession();
				sessions.setAttribute("VendorID", Integer.parseInt(id));
			}
			
			else {
				PrintWriter out =response.getWriter();
				out.println("Invalid userName or Password");

		}
			
		doGet(request, response);
	}

	}
	}


