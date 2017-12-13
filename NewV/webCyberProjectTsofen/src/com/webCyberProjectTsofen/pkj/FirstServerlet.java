package com.webCyberProjectTsofen.pkj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServerlet
 */

@WebServlet("/FirstServerlet")
public class FirstServerlet extends HttpServlet {
	List<Event>myList; 
	DataBase data;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    //minor, medium, critical
    public FirstServerlet() {
        super();
 
         data=new DataBase("localhost", "3306", "root", "admin", "sys");
    	myList=data.getAllEvents();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("posts",myList);
		
		//getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
		
		
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
         dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
