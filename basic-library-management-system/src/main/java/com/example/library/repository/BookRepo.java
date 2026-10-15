package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>  {

}
