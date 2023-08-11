package com.jsp.book_store.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookConnection {
	
	/**
	 * connection method return connection
	 * @return
	 */
	public static Connection getConnection() 
	{
		try 
		{
			
			//step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url="jdbc:mysql://localhost:3306/book_database";
			String user="root";
			String pass="root";
			//step-2 create connection
			Connection con=DriverManager.getConnection(url,user,pass);
			return con;
			
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
