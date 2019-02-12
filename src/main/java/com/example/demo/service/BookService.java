package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getBooks() {

		return bookDao.getBooks();
	}
}
