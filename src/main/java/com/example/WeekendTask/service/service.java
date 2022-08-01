package com.example.WeekendTask.service;

import com.example.WeekendTask.model.Books;

import java.util.List;

public interface service {
    Books saveBook(Books book);
    List<Books> getAllBook();
    Books getBookById(int id);
    Books updateBook(Books book,int id);
    void deleteBook(int id);
}
