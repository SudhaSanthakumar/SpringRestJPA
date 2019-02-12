package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table()
public class Book {

	private String bookName;
	private int bookId;

	public Book(int id, String name) {
		this.bookId = id;
		this.bookName = name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Book getBook(int id) {
		return this;

	}

	public int getBookId() {
		// TODO Auto-generated method stub
		return this.bookId;
	}
}
