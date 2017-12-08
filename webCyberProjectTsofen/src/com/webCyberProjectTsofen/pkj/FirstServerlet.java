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
public class FirstServerlet extends HttpServlet {
	ArrayList<Event>myList=new ArrayList<Event>();
	private static final long serialVersionUID = 1L;
    private Event ev1,ev2,ev3,ev4,ev5,ev6,ev7,ev8,ev9,ev10;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    //minor, medium, critical
    public FirstServerlet() {
        super();
       ev1=new Event("pc-1", "192.155.45.15-Tsofen","minor","5/12/2017-22:6","log text");
       ev2=new Event("pc-2", "192.155.45.15-ds","minor","5/12/2017-22:6","log text");
       ev3=new Event("pc-3", "192.155.45.15-dsTsofen","minor","5/12/2017-22:6","log text");
       ev4=new Event("pc-4", "192.155.45.15-home","minor","5/12/2017-22:6","log text");
       ev5=new Event("pc-5", "192.155.45.15-areen","minor","5/12/2017-22:6","log text");
       ev6=new Event("pc-6", "192.155.45.15-alaa","minor","5/12/2017-22:6","log text");
       ev7=new Event("pc-7", "192.155.45.15-anwar","minor","5/12/2017-22:6","log text");
       ev8=new Event("pc-8", "192.155.45.15-yasmen","minor","5/12/2017-22:6","log text");
       ev9=new Event("pc-9", "192.155.45.15-Tsofen","minor","5/12/2017-22:6","log text");
       ev10=new Event("pc-10", "192.155.45.15-Tsofen","minor","5/12/2017-22:6","log text");
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
