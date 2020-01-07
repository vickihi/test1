package com.johnabbott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.model.Book;
import com.johnabbott.service.BookService;

@Controller
@RequestMapping("/computerbooks")

public class ComputerBKController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/computerbooks", method = RequestMethod.GET)
	public ModelAndView getComputerBookList() {
		ModelAndView modelView = new ModelAndView("computerbook-list");

		List<Book> computerbooks = service.getComputerBooks();
		modelView.addObject("computerbookList", computerbooks);
		
		return modelView;
	}

}
