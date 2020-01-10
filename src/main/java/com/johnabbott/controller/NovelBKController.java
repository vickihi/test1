package com.johnabbott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

		List<Book> novelbooks = service.getBooks();
		modelView.addObject("novelbookList", novelbooks);
		modelView.addObject("book", new Book());
		//modelView.addObject("book", new Book(3,"A", "B", 2000));

		return modelView;
	}
	
	@RequestMapping(value = "saveBook", method= RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		if(service.addBook(book))
			return "redirect:/novel/novelbooks";
		else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "deletebook")
	public String deleteBook(@RequestParam("bookId") int bookId) {
		return "";
	}

	@RequestMapping(value = "editbook")
	public ModelAndView editBook(@RequestParam("bookId") int bookId) {
		ModelAndView mv = new ModelAndView("update-book");
		Book fetchedBook = service.getBookById(bookId);
		mv.addObject("editedbook", fetchedBook);
		return mv;
	}

	@RequestMapping(value = "updatebook")
	public String updateBook(@ModelAttribute("book") Book book) {
		if (service.updateBook(book)) {
			return "redirect:/novel/novelbooks";
		} else {
			return "ErrorPage";
		}
	}
}
