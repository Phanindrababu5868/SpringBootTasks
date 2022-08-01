package com.example.WeekendTask.Controllers;

import com.example.WeekendTask.model.Books;
import com.example.WeekendTask.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class Bookcontrollers {
    @Autowired
    private service booksService;

    public Bookcontrollers(service booksService) {
        this.booksService = booksService;
    }
    @PostMapping
    public ResponseEntity<Books> saveBook(@RequestBody Books book)
    {
        return new ResponseEntity<Books>(booksService.saveBook(book), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Books> getAllBooks()
    {
        return booksService.getAllBook();
    }
    @GetMapping("{id}")
    public ResponseEntity<Books> getBookById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Books>(booksService.getBookById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Books> updateBook(@PathVariable("id")int id,@RequestBody Books book)
    {
        return new ResponseEntity<Books>(booksService.updateBook(book,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id")int id)
    {
        booksService.deleteBook(id);
        return new ResponseEntity<String>("Book data deleted successfully",HttpStatus.OK);
    }
}
