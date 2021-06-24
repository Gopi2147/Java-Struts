package com.servel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.BookDetails;
import com.assessment.BooksDao;


/**
 * Servlet implementation class ServletAssess
 */
@WebServlet("/book.do")
public class ServletAssess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAssess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(BooksDao.authDet());
		request.setAttribute("authorlist", BooksDao.authDet());
		request.setAttribute("booklist", BooksDao.bookDet());
		RequestDispatcher rd= request.getRequestDispatcher("bookers.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		int bookid= Integer.parseInt(request.getParameter("bookid"));
		String name = request.getParameter("name");
		double price= Double.parseDouble(request.getParameter("price"));
		double authorid= Double.parseDouble(request.getParameter("authorid"));
		double pages= Double.parseDouble(request.getParameter("pages"));
		BookDetails b= new BookDetails(bookid, name, price, authorid, pages);
		 if(BooksDao.insert(b))
			   response.sendRedirect("book.do");
		   else
			   response.getWriter().print("Something went wrong check log");
	}

}
