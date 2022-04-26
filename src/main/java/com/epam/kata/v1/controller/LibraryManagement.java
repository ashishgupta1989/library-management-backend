package com.epam.kata.v1.controller;

import java.util.List;

import com.epam.kata.entity.Book;
import com.epam.kata.service.LibraryManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1/library-management")
public class LibraryManagement {

    @Autowired
    private LibraryManagementService libraryManagementService;

    @PostMapping("/add")
    public ResponseEntity<Integer> addBooks(@RequestBody Book book){
        return ResponseEntity.ok(libraryManagementService.createBook(book));
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        log.info("calling getBooks");
        return ResponseEntity.ok(libraryManagementService.getBooks());
    }

}
