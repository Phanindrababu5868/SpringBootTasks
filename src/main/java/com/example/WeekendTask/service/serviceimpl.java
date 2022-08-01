package com.example.WeekendTask.service;
import com.example.WeekendTask.model.Books;
import com.example.WeekendTask.repositry.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceimpl implements service{
    @Autowired
    private BooksRepo booksRepo;

    public serviceimpl
            (BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }
    @Override
    public Books saveBook(Books book)
    {
        return booksRepo.save(book);
    }
    @Override
    public List<Books> getAllBook()
    {

        return (List<Books>) booksRepo.findAll();
    }
    @Override

    public Books getBookById(int id)
    {
        return booksRepo.findById(id).orElseThrow();
    }
    @Override
    public Books updateBook(Books book,int id)
    {
        Books existingBook=booksRepo.findById(id).orElseThrow();

        existingBook.setBookname(book.getBookname());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        booksRepo.save(existingBook);
        return existingBook;
    }

    @Override
    public void deleteBook(int id) {
        booksRepo.findById(id).orElseThrow();
        booksRepo.deleteById(id);
    }

}