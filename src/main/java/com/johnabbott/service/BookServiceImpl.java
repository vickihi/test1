package com.johnabbott.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.model.Book;

@Service
public class BookServiceImpl implements BookService{
	
	List<Book> listBooks;
	
	public List<Book> getComputerBooks(){
		listBooks = new ArrayList<Book>();
		
		listBooks.add(new Book(1, "computerbook1", "author1", 1995));
		listBooks.add(new Book(2, "computerbook2", "author2", 2000));
		
		return listBooks;
	}
	
	public List<Book> getNovelBooks(){
		listBooks = new ArrayList<Book>();
		
		listBooks.add(new Book(3, "novelbook1", "author3", 2015));
		listBooks.add(new Book(4, "novelbook2", "author4", 1998));
		
		return listBooks;
	}
	
	public List<Book> getBooks(){
		return listBooks;
	}
	
	@Override
	public boolean addBook(Book bk) {
		bk.setId(listBooks.size() + 1);
		listBooks.add(bk);
		return true;
	}
	
	

}