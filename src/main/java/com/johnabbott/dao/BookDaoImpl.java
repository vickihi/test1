package com.johnabbott.dao;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.johnabbott.model.Book;

@Repository
@Qualifier("bookdao")
public class BookDaoImpl implements BookDao {
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_INSERT_BOOK = "insert into novelbook(bookname, author, year) values(?, ?, ?)";
	
	private final String SQL_UPDATE_BOOK = "update novelbook set bookname= ? , author =? , year = ? where id = ? ";

	private final String SQL_SELECT_BOOK = "select id, bookname, author, year" + " from novelbook";
		
	private final String SQL_SELECT_BOOK_BY_ID = "select id, bookname, author, year from novelbook where id = ?";
	
	private final String SQL_DELETE_BOOK = "delete novelbook where id = ? ";
	
	public BookDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int insertBook(Book book){
		return jdbcTemplate.
				update(SQL_INSERT_BOOK, 
						book.getBookName(), 
						book.getAuthor(), 
						book.getYear());
	}
		
	@Override
	public List<Book> getBooks() {
		return jdbcTemplate.query(SQL_SELECT_BOOK, new BookMapper());
	}

	@Override
	public Book getBookById(int bookId) {
		return jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, 
				new Object[]{bookId}, new BookMapper());
	}

	@Override
	public boolean deleteBook(int bookId) {
		int deleteResult = jdbcTemplate.update(SQL_DELETE_BOOK, bookId);
		return deleteResult > 0;
	}

	@Override
	public boolean updateBook(Book book) {
		int updateResult = jdbcTemplate.update
				(SQL_UPDATE_BOOK, 
						book.getBookName(), 
						book.getAuthor(), 
						book.getYear(),
						book.getId());
		return updateResult > 0;
	}
	


}