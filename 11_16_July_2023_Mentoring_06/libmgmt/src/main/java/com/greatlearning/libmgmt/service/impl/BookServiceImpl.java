package com.greatlearning.libmgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.libmgmt.entity.Book;
import com.greatlearning.libmgmt.repository.BookRepository;
import com.greatlearning.libmgmt.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> listAll() {
		
		return bookRepository.findAll();
	}

	@Override
	public void save(Book book) {
		
		bookRepository.save(book);
	}

	@Override
	public Book findById(int bookId) {
		
		return bookRepository.findById(bookId).get();
	}

	@Override
	public void delete(int bookId) {
		
		bookRepository.deleteById(bookId);
	}

	@Override
	public List<Book> searchBy(String title, String author) {
		
		return bookRepository.findByTitleContainsAndAuthorContainsIgnoreCase(
			title, author);
		
	}

}
