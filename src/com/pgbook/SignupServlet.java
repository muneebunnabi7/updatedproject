package com.pgbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
		String email= request.getParameter("email");
		String uname= request.getParameter("uname");
		String password= request.getParameter("password");
		Signup su=new Signup();
		    su.setEmail(email);
		    su.setUname(uname);
		    su.setPassword(password);
		    
		    SignupJdbc jd=new SignupJdbc();
		    ArrayList<Signup> al = new ArrayList<Signup>();
		    al.add(su);
		    int check =jd.saveData(al);
		    if(check>0)
		    {
		    	System.out.println("data iserted");
		    	response.sendRedirect("RoomReg.jsp");
		    }
		    else {
		    	System.out.println("not inserted");
		    }
		    
	}

}
