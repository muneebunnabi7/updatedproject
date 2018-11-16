package com.pgbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		           String uname =request.getParameter("name");
		           String password=request.getParameter("passw");
		           LoginData lo=new LoginData();
		           lo.setName(uname);
		           lo.setPass(password);
		           SignupJdbc d = new SignupJdbc();
		           boolean flag=d.checkMember(lo);
		           System.out.println(flag);
		           if(flag) {
		          // ArrayList<LoginData> ls=new ArrayList<LoginData>();
		          // ls.add(lo);
		           //LoginJdbc db=new LoginJdbc();
		           //int check=db.enterData(ls);
		          // if(check>0) {
		        	//   System.out.println("data entered in log  table");
		          // }else
		          // {
		        	  // System.out.println("data did not inserteds");
		          // }
		        	   response.sendRedirect("RoomReg.jsp");
		           }
		           else
		           {
		        	   response.sendRedirect("SignUp.jsp");
		           }
		doGet(request, response);
	}

}
