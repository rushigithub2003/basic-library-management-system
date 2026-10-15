package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Author;
import com.example.library.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService as;

	@PostMapping("author")
	String addAuthor(@RequestBody Author a) {
		as.addAuthor(a);
		return "Author Added";
	}

	@GetMapping("author/{id}")
	Author getAuthorById(@PathVariable int id) {
		return as.getAuthorById(id);
	}

	@DeleteMapping("author/{id}")
	String deleteAuthorById(@PathVariable int id) {
		as.deleteAuthorById(id);
		return "Author deleted";
	}

	@DeleteMapping("author")
	String deleteAllAuthor() {
		as.deleteAllAuthor();
		return "All Author Deleted";
	}

}
