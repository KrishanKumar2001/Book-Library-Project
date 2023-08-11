package com.jsp.book_store.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.book_store.dao.BookDao;
import com.jsp.book_store.dto.Book;


@WebServlet("/updateBook")
public class UpdateBookController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String color=req.getParameter("color");
		String price=req.getParameter("price");
		String author=req.getParameter("author");
		
		Book book =new Book();
		book.setId(id);
		book.setName(name);
		book.setColor(color);
		book.setPrice(price);
		book.setAuthor(author);
		
		BookDao bookdao=new BookDao();
		bookdao.updateBook(book);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, resp);
	}
	

}
