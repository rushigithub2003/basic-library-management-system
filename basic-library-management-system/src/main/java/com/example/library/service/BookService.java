package com.example.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo bp;

	// add Book
	public void addBook(Book b) {
		bp.save(b);
	}

	// getBookById
	public Book getBookById(int id) {
		return bp.findById(id).get();
	}

	// delete Book By Id
	public void deleteById(int id) {
		bp.deleteById(id);
	}

	// DeleteAll Book
	public void deleteAllBook() {
		bp.deleteAll();
	}
}
