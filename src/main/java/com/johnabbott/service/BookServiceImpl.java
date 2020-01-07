package com.johnabbott.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.model.Book;

@Service
public class BookServiceImpl implements BookService{
	public List<Book> getComputerBooks(){
		List<Book> computerbooks = new ArrayList<Book>();
		
		computerbooks.add(new Book("computerbook1", "author1", 1995));
		computerbooks.add(new Book("computerbook2", "author2", 2000));
		
		return computerbooks;
	}
	
	public List<Book> getNovelBooks(){
		List<Book> novelbooks = new ArrayList<Book>();
		
		novelbooks.add(new Book("novelbook1", "author3", 2015));
		novelbooks.add(new Book("novelbook2", "author4", 1998));
		
		return novelbooks;
	}

}
