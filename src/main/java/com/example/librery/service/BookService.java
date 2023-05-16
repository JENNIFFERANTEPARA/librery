package com.example.librery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.librery.model.Book;
import com.example.librery.repository.IBookRepository;

@Service
public class BookService {
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll()
    {
        return bookRepository.getAll();
    }

    public Book get(String bookId)
    {
        return bookRepository.get(bookId);
    }

    public Book addBook(Book book)
    {
        book.setBookId(null);
        return bookRepository.save(book);
    }

    public Book updateBook(String BookId, Book book)
    {
        Book bookR = bookRepository.get(BookId);
        if (bookR == null)
        {
            return null;
        }
        return bookRepository.save(book);
    }

    public Book deleteBook(String bookId){
        return bookRepository.delete(bookId);
    }


}