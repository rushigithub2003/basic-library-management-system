package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Book;
import com.example.library.service.BookService;


@RestController
public class BookController {

	@Autowired
	BookService bs;

	@PostMapping("Book")
	String addBook(@RequestBody Book b) {
		bs.addBook(b);
		return "Book Added";
	}

	@GetMapping("Book/{id}")
	Book getBookById(@PathVariable int id) {
		return bs.getBookById(id);
	}

	@DeleteMapping("Book/{id}")
	String deleteBookById(@PathVariable int id) {
		bs.deleteById(id);
		return "Book Delete";
	}
	
	@DeleteMapping("Book")
	String deleteAllBook()
	{
		bs.deleteAllBook();
		return "All Book Deleted";
	}
}
