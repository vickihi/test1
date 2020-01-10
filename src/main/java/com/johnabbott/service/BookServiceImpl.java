package com.johnabbott.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.johnabbott.dao.BookDao;
import com.johnabbott.model.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	@Qualifier("bookdao")
	BookDao bookDao;
	
	List<Book> listBooks;
	
//	public List<Book> getComputerBooks(){
//		listBooks = new ArrayList<Book>();
//		
//		listBooks.add(new Book(1, "computerbook1", "author1", 1995));
//		listBooks.add(new Book(2, "computerbook2", "author2", 2000));
//		
//		return listBooks;
//	}
	
	public BookServiceImpl() {
		listBooks = new ArrayList<Book>();
		
		listBooks.add(new Book(3, "novelbook1", "author3", 2015));
		listBooks.add(new Book(4, "novelbook2", "author4", 1998));
	}
	
//	public List<Book> getNovelBooks(){
//		listBooks = new ArrayList<Book>();
//		
//		listBooks.add(new Book(3, "novelbook1", "author3", 2015));
//		listBooks.add(new Book(4, "novelbook2", "author4", 1998));
//		
//		return listBooks;
//	}
	
	public List<Book> getBooks(){
		return bookDao.getBooks();
	}
	
	@Override
	public boolean addBook(Book book) {
		return bookDao.insertBook(book) > 0 ;
	}
	
	@Override
	public Book getBookById(int bookId) {
		return bookDao.getBookById(bookId);
	}

	@Override
	public boolean deleteBook(int bookId) {
		return bookDao.deleteBook(bookId);
	}

	@Override
	public boolean updateBook(Book book) {
		return bookDao.updateBook(book);
	}
	
	

}
