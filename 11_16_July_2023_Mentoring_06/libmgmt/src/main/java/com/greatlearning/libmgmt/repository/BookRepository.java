package com.greatlearning.libmgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.libmgmt.entity.Book;

public interface BookRepository 
	extends JpaRepository<Book, Integer>{

//	List<Book> searchAllBooks(String title, String author);


//	// select * from book where title = '<some_value>'
//	List<Book> findByTitle(String title);
//	
//	// select * from book where author = '<some_author_value>'	
//	List<Book> findByAuthor(String author);
//
//	// select * from book where title = '' AND author = ''	
//	List<Book> findByTitleAndAuthor(String title, String author);
//
//	//	select * from book where author like '%<title>%';
//	List<Book> findByTitleContains(String title);
	
	// Book
//		title
//		author
//		category
	
	
	List<Book>
	findByTitleContainsAndAuthorContainsIgnoreCase
		(String title, String author);

	
//	List<Book>
//	findByTitleContainsOrAuthorContainsIgnoreCase
//		(String title, String author);
	
}
