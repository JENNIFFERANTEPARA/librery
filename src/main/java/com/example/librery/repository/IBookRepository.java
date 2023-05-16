package com.example.librery.repository;

import java.util.List;

import com.example.librery.model.Book;

public interface IBookRepository {
    public List<Book> getAll();
    public Book get(String bookId);
    public Book save(Book book);
    public Book delete(String bookId);
}
