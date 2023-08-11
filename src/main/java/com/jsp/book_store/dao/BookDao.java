package com.jsp.book_store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.book_store.connection.BookConnection;
import com.jsp.book_store.dto.Book;

public class BookDao {
	
	//took connection by created connetion method
	Connection con=BookConnection.getConnection();
	
/////////////===============Insert==================////////////////////
	/**
	 * save details into database by taking data from Dto pack- Book Class getters method
	 * @return 
	 */
	public Book saveBookDetails(Book book) 
	{
		//step-3 import query
		String insert_query="insert into book(name,color,price,author) values(?,?,?,?)";
		
		try {
			
			//step-4 create statement
			PreparedStatement pst=con.prepareStatement(insert_query);
			pst.setString(1,book.getName() );
			pst.setString(2, book.getColor());
			pst.setString(3, book.getPrice());
			pst.setString(4,book.getAuthor());
			
			//step-5 execute statement
			pst.execute();
			
			return book;
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
   /////////////==============Display===================////////////////////
	
	/**
	 * display methods to dispaly books details
	 */
	public List<Book> displayBookDetails()
	{
		//step-3 import display query
		String display_query="SELECT * FROM book";
		
		
		 try {
			//step-4 create prepared statement
			PreparedStatement pst=con.prepareStatement(display_query);
			
			//step-5 execute statment
			 ResultSet rst=pst.executeQuery();
			 List <Book> l1=new ArrayList<Book>();
			 while(rst.next())
			 {
				 Book book =new Book(rst.getInt("id"),rst.getString("name"),rst.getString("color"),rst.getString("price"),rst.getString("author"));
				 
				 l1.add(book);
			 }
			return l1;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 
		
		
		return null;
		
	}
	
	//========================
	
	/*
	 * getCustomerById
	 */
	public Book getBookById(int bookid) {
		
		String display_query = "select * from book where id=?";
		

		try {
			PreparedStatement pst = con.prepareStatement(display_query);
			
			pst.setInt(1, bookid);
			
			ResultSet rst=pst.executeQuery();
			
						
			if(rst.next()) {
				
				Book book =new Book();
				
				book.setId(rst.getInt(1));
				book.setName(rst.getString(2));
				book.setColor(rst.getString(3));
				book.setPrice(rst.getString(4));
				book.setAuthor(rst.getString(5));
				return book;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	/////////////==============Delete===================/////////////////////////////////
	/*
	 * deleteCustomer By Id
	 */
	
	
	public int deleteBook(int id) 
	{
		//step-3 import delete query
		String delete_query="DELETE FROM book WHERE id=?";
		
		
		
		try {
			
			//step-4 create statment
			PreparedStatement pst=con.prepareStatement(delete_query);
			pst.setInt(1, id);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	//========================Update======================
	
	/*
	 * updateCustomerData
	 */
	
       public int updateBook(Book book) 
       {
    	   //step-3 import update Query
    	   String update_query="UPDATE book SET name=?,color=?,price=?, author=? WHERE id =?";
    	   
    	   
    	   try {
    		   
    		 //step-4 create statment
			PreparedStatement pst=con.prepareStatement(update_query);
			  
			pst.setString(1,book.getName());
			pst.setString(2, book.getColor());
			pst.setString(3, book.getPrice());
			pst.setString(4, book.getAuthor());
			pst.setInt(5,book.getId());
			
			return pst.executeUpdate();
		   } catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
    	   
       }
	
	
	
	//ENd class
}
