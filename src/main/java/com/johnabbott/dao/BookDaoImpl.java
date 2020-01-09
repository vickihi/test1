package com.johnabbott.dao;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.johnabbott.model.Book;

@Repository
@Qualifier("bookdao")
public class BookDaoImpl implements BookDao {
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_INSERT_BOOK = "insert into "
			+ "novelbook(bookname, author, year) values(?, ?, ?)";
	
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
}