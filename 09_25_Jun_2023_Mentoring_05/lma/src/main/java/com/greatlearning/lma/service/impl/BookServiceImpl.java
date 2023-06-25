package com.greatlearning.lma.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.repository.BookRepository;
import com.greatlearning.lma.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> fetchAllBooks() {		
		return bookRepository.findAll();
	}

	@Override
	public void save(Book book) {
		
		bookRepository.save(book);
	}

	@Override
	public Book findBookById(int bookId) {
		
		Optional<Book> optional = 
		bookRepository.findById(bookId);
		
		return optional.get();
	}

	@Override
	public void delete(int bookId) {
		
		bookRepository.deleteById(bookId);
	}

}
