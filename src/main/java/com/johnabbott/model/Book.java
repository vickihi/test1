package com.johnabbott.model;

public class Book {
	
	private String BookName;
	private String Author;
	private int Year;
	
	public Book() {
		
	}

	public Book(String bookName, String author, int year) {
		super();
		BookName = bookName;
		Author = author;
		Year = year;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
	





}
