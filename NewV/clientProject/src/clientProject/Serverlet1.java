package clientProject;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serverlet1
 */
@WebServlet("/Serverlet1")
public class Serverlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Event>myList; 
	DataBase data;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serverlet1() {
        super();
        //data=new DataBase(address, port, username, password, database)
      // data=new DataBase("localhost", "3306", "root", "admin", "sys");
      data=new DataBase("192.168.2.106", "3306", "root", "1234", "sys");
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
