package com.johnabbott.service;

import java.util.List;

import com.johnabbott.model.Book;

public interface BookService {
	
	public boolean addBook(Book book); //Create
	
	public List<Book> getBooks(); //Read
	
	public Book getBookById(int bookId); //Read
	
	public boolean deleteBook(int bookId); //Delete
	
	public boolean updateBook(Book book); //Update

}
