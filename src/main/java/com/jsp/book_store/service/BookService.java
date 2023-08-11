package com.jsp.book_store.service;

import com.jsp.book_store.dao.BookDao;
import com.jsp.book_store.dto.Book;

public class BookService {
	
	BookDao bookdao=new BookDao();
//==========================insert=====================	
	public Book saveServiceBookDetails(Book b) 
	{
		return bookdao.saveBookDetails(b);
		
	}
	
//==================delete=========================	
	/*
	 * deleteCustomer By Id
	 */
	public int deleteBookByIdService(int x) 
	{
		return bookdao.deleteBook(x);
		
	}
	
	
//========================Update======================
	
		/*
		 * updateCustomerData
		 */	

	public int updateBookService(Book book) 
	{
		return bookdao.updateBook(book);
		
		
	}
	
	
}
