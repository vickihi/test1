package com.johnabbott.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.johnabbott.model.Book;


public class BookMapper implements RowMapper<Book>{
	
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getInt("id"), rs.getString("bookName"),
				rs.getString("author"), rs.getInt("year"));
	}

}
