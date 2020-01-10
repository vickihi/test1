package com.johnabbott.dao;
import java.util.List;

import com.johnabbott.model.Book;

public interface BookDao {
	
	public int insertBook(Book book); //Create
	
	public List<Book> getBooks(); //Read
	
	public Book getBookById(int bookId); //Read
	
	public boolean deleteBook(int bookId); //Delete
	
	public boolean updateBook(Book book); //Update
	

}
