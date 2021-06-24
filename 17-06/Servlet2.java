package com.servel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.datas.Main;
import com.datas.PersonDao;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/person.do")
public class Servlet2 extends HttpServlet {
	static int sessionCount;
	static int totalCount;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		ServletContext application= request.getServletContext();
		Integer scount= (Integer)session.getAttribute("count");
		Integer acount= (Integer)application.getAttribute("count");
		if(scount==null)
			session.setAttribute("count", 1);
		else
			session.setAttribute("count", scount+1);
		if(acount==null)
			application.setAttribute("count", 1);
		else
			application.setAttribute("count", acount+1);
		request.setAttribute("peoplelist", PersonDao.getPeople());
		RequestDispatcher rd= request.getRequestDispatcher("people2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		int empID= Integer.parseInt(request.getParameter("empID"));
		String name = request.getParameter("name");
		   String city = request.getParameter("city");
		   String designation= request.getParameter("designation");
		   Main M= new Main(empID, name, city, designation);
		   if(PersonDao.insert(M))
			   response.sendRedirect("person.do");
		   else
			   response.getWriter().print("Something went wrong check log");		   
	}
}
