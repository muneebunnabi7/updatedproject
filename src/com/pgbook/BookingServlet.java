package com.pgbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname =request.getParameter("fname");
		String sname =request.getParameter("sname");
		String lname =request.getParameter("lname");
		String gender =request.getParameter("gend");
		String mstatus =request.getParameter("status");
		String dob =request.getParameter("bdate");
		String checkin =request.getParameter("indtate");
		String checkout =request.getParameter("outdate");
		String noper =request.getParameter("number");
		String email =request.getParameter("mail");
		int phone =Integer.parseInt(request.getParameter("phone"));
		String state =request.getParameter("state");
		String city =request.getParameter("city");
		String zip =request.getParameter("zip");
		int adhar =Integer.parseInt(request.getParameter("anum"));
		int pan =Integer.parseInt(request.getParameter("pnum"));
		BookingForm b =new BookingForm();
		b.setFname(fname);
		b.setSname(sname);
		b.setLname(lname);
		b.setGender(gender);
		b.setMstatus(mstatus);
		b.setDob(dob);
		b.setCheckin(checkin);
		b.setCheckout(checkout);
		b.setNoper(noper);
		b.setEmail(email);
		b.setPhone(phone);
		b.setState(state);
		b.setCity(city);
		b.setZip(zip);
		b.setAdhar(adhar);
		b.setPan(pan);
		List<BookingForm> lis = new ArrayList<BookingForm>();
		lis.add(b);
		BookingData bk = new BookingData();
		int status = bk.saveData(lis);
		if(status >0)
		{
			System.out.println("data Saved");
		}
		else
		{
			System.out.println("not saved");
		}
		
		ArrayList<BookingForm> list = bk.showData();
		//HttpSession session =request.getSession(true);
		//session.setAttribute("Data", list);*/
		request.setAttribute("data", list);
		RequestDispatcher req=request.getRequestDispatcher("ShowBooking.jsp");
	     req.forward(request,response);
		//response.sendRedirect("message.jsp");
		
	}

}
