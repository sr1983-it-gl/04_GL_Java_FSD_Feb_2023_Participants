package com.greatlearning.lma.service;

import java.util.List;

import com.greatlearning.lma.entity.Book;

public interface BookService {

	List<Book> fetchAllBooks();
	
	void save(Book book);
	
	Book findBookById(int bookId);
	
	void delete(int bookId);
}
