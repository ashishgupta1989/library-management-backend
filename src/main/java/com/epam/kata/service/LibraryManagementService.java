package com.epam.kata.service;

import java.util.List;

import com.epam.kata.entity.Book;
import com.epam.kata.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryManagementService {
    @Autowired
    private BookRepository bookRepository;

    public Integer createBook(Book book){
        return bookRepository.save(book).getBookId();
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
