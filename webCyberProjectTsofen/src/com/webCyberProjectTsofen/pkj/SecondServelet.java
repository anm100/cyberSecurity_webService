package com.webCyberProjectTsofen.pkj;

import java.io.IOException;
import java.util.ArrayList;

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
public class SecondServelet extends HttpServlet {
	ArrayList<Log>myList=new ArrayList<Log>();
	private static final long serialVersionUID = 1L;
    private Log ev1,ev2,ev3,ev4,ev5,ev6,ev7,ev8,ev9,ev10;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    //minor, medium, critical
    public SecondServelet() {
        super();
      
       ev1=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev2=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev3=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev4=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev5=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev6=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev7=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev8=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev9=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       ev10=new Log("10.10.10.10","abs1234","Medium","12:99","log.123");
       
       
       myList.add(ev1);
       myList.add(ev2);
       myList.add(ev3);
       myList.add(ev4);
       myList.add(ev5);
       myList.add(ev6);
       myList.add(ev7);
       myList.add(ev8);
       myList.add(ev9);
       myList.add(ev10);

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("posts",myList);
		
		//getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
		
		
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index2.jsp");
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
