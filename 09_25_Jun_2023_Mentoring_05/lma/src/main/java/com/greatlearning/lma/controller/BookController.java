package com.greatlearning.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public String listAllBooks(Model model) {
		
		// fetch all the books
		
		List<Book> books = bookService.fetchAllBooks();
		
		model.addAttribute("books", books);
		
		return "books/list-books";
	}
	
	@GetMapping("/addStep1")
	public String addStep1DisplayForm(Model model) {
		
		Book newBook = new Book();
//		newBook.setAuthor("ABC");
		
		model.addAttribute("book", newBook);
		
		return "books/book-form";
	}
	
	@PostMapping("/save")
//	@GetMapping("/save")
	public String addStep2CollectDetailsAndSave(
		@ModelAttribute("book")Book book) {
		
		System.out.println("Book ID" + book.getId());
		
		// title, author, category
		
		bookService.save(book);
	
		return "redirect:/books/list";
	}
	
	
	@PostMapping("/updateStep1")
	public String updateStep1DisplayForm(
			@RequestParam("bookId")int bookId,
			Model model) {
		
		Book existingBook = bookService.findBookById(bookId);
				
		model.addAttribute("book", existingBook);
		
		return "books/book-form";
	}

	@PostMapping("/delete")
	public String deleteBook(
			@RequestParam("bookId")int bookId) {
		
		bookService.delete(bookId);
		
		return "redirect:/books/list";
	}
}

