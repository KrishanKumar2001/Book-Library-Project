package com.jsp.book_store.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.book_store.dao.BookDao;
import com.jsp.book_store.dto.Book;

public class BookController implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		@SuppressWarnings("unused")
		PrintWriter printwriter= res.getWriter();
	//storing book into database	
		String name=req.getParameter("bookname");
		String color=req.getParameter("bookcolor");
		String price=req.getParameter("bookprice");
		String author=req.getParameter("bookauthor");
		
		BookDao bookdao= new BookDao();
		Book book= new Book(name,color,price ,author);
		Book b=bookdao.saveBookDetails(book);
		
		if(b!=null) 
		{
			
			printwriter.write("<html><body>");
			printwriter.write("<h1>Congrats!! Book is added</h1>");
			printwriter.write("</html></body>");
			
		}else 
		{
			printwriter.write("<html><body>");
			printwriter.write("<h1>Sorry!!Failed to store..</h1>");
			printwriter.write("</html></body>");
			
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		 dispatcher.include(req, res);
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
