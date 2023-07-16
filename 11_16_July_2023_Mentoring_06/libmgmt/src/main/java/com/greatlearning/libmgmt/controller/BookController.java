package com.greatlearning.libmgmt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.libmgmt.entity.Book;
import com.greatlearning.libmgmt.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/list")
	public String listBooks(Model modelObj) {
		
		List<Book> books = bookService.listAll();
		
		modelObj.addAttribute("Books", books);
		
		return "books-lister";
	}
	
	@RequestMapping("/addStep1")
	public String addBookStep1(Model modelObj) {
		
		Book newBook = new Book();
		
		modelObj.addAttribute("Book", newBook);
		
		return "book-form";
	}

	@RequestMapping("/updateStep1")
	public String addBookStep1(
			@RequestParam("bookId") int bookId,
			Model modelObj) {
		
		Book existingBook = bookService.findById(bookId);
		
		modelObj.addAttribute("Book", existingBook);
		
		return "book-form";
	}
	
	@PostMapping("/save")
	public String saveBook(
		
		@RequestParam("id") int id,
		
		@RequestParam("title") String title,
		@RequestParam("author") String author,
		@RequestParam("category") String category
		) {
		
		
		if (id != 0) {
			
			// Update flow
			
			Book existingBook = bookService.findById(id);
			
			
			existingBook.setTitle(title);
			existingBook.setAuthor(author);
			existingBook.setCategory(category);
			
			bookService.save(existingBook);
			
		}else {
			
			// Add flow
			
			Book newBook = new Book(title, category, author);
			bookService.save(newBook);
		}
		
		return "redirect:/books/list";
	}
	
	
	@RequestMapping("/delete")
	public String deleteBook(
		@RequestParam("bookId")	int bookId) {
		
		bookService.delete(bookId);
	
		return "redirect:/books/list";
	}
	
	
	@RequestMapping("/search")
	public String searchBooks(
			
		@RequestParam("title")	String title,
		@RequestParam("author") String author,
		Model modelObj) {
		
		
		if (title.trim().isEmpty() && author.trim().isEmpty()) {
			return "redirect:/books/list";
		}else {
		
			List<Book> books = bookService.searchBy(title, author);

			modelObj.addAttribute("Books", books);
			
			return "books-lister";

		}
				
	}
	
	@RequestMapping(value = "/403")
	public ModelAndView handlePermissionErrors(
			Principal user) {
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("403");
		
		String message = "You dont have persmission to perform the operation";
		
		mv.addObject("msg", message);
		
		return mv;
	}
}
