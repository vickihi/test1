package com.johnabbott.model;

public class Book {
	
	private int id;
	private String bookName;
	private String author;
	private int year;
	
	public Book() {
		
	}

	public Book(int id, String bookName, String author, int year) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.year = year;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	





}
