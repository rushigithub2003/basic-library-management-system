package com.example.library.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.Author;
import com.example.library.repository.AuthorRepo;

@Service
public class AuthorService {

	@Autowired
	AuthorRepo ar;

	// add Author
	public void addAuthor(Author a) {
		ar.save(a);
	}

	// get Author By Id
	public Author getAuthorById(int id) {
		
		Optional<Author> o = ar.findById(id);

		return o.get();
	}

	// delete Author By Id
	public void deleteAuthorById(int id) {
		ar.deleteById(id);
	}

	// deleteAll Author
	public void deleteAllAuthor() {
		ar.deleteAll();
	}
}
