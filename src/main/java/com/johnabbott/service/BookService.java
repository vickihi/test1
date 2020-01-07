package com.johnabbott.service;

import java.util.List;

import com.johnabbott.model.Book;

public interface BookService {
	
	public List<Book> getNovelBooks();
	
	public List<Book> getComputerBooks();

}
