package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Userservlet
 */
@WebServlet("/Userservlet")
public class Userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	     PrintWriter out=response.getWriter();
	     String un=request.getParameter("username");
	     String pd=request.getParameter("pwd");
	     String em=request.getParameter("uemail");
	     int ag=Integer.parseInt(request.getParameter("age"));
	     out.println("user details:");
	     out.println("user name:"+un);
	     out.println("password:"+pd);
	     out.println("email id:"+em);
	     out.println("age:"+ag);
	
	}
	

}
