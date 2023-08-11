package com.jsp.book_store.dto;
/**
 * 
 * @author krish
 *
 */
public class Book {
	
	//here data will be stored by below constructor from html form
	private int id;
	private String name;
	private String color;
	private String price;// double
	private String author;
	
	
	/**
	 * no argument constructor
	 */
	public Book() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param name
	 * @param color
	 * @param price
	 * @param author
	 */
	public Book(int id, String name, String color, String price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.author = author;
	}


	/**
	 * @param name
	 * @param color
	 * @param price
	 * @param author
	 */
	public Book(String name, String color,String price, String author) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.author = author;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
//	@Override
//	public String toString() {
//		
//		return id+name+color+price+author;
//	}
	
	
	

}
