package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public class BookDao {

	private static List<Book> books = new ArrayList<Book>();

	static {
		books.add(new Book(101, "Java"));
		books.add(new Book(102, "DS"));
		books.add(new Book(121, "Spring"));
		books.add(new Book(131, "Cookbook"));
		books.add(new Book(111, "Oceans"));

	}

	public Book getBookById(int id) {
		for (Book book : books) {
			if (book.getBookId() == id) {
				return book;
			}
		}
		return null;

	}

	public List<Book> getBooks() {
		return books;
	}

}
