package com.johnabbott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.model.Book;
import com.johnabbott.service.BookService;

@Controller
@RequestMapping("/novel")

public class NovelBKController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/novelbooks", method = RequestMethod.GET)
	public ModelAndView getNovelBookList() {
		ModelAndView modelView = new ModelAndView("novelbook-list");

		List<Book> novelbooks = service.getNovelBooks();
		modelView.addObject("novelbookList", novelbooks);
		
		return modelView;
	}

}
