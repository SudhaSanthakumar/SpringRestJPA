package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Book> getBooks() {

		return bookService.getBooks();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Book getBookById(@PathVariable("id") int id) {
		System.out.println("inside getbyid");
		return bookService.getBookById(id);
	}
}
