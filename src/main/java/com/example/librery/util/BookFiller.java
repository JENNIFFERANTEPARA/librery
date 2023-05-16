package com.example.librery.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.librery.model.Book;
import com.example.librery.service.BookService;

@Component
public class BookFiller {
    private final BookService bookService;
    
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init()
    {
        Book book1 = new Book("la comunidad del anillo",
         "primer libro del señor de los anillo", "J.R Tolkien");
         bookService.addBook(book1);
         try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }
         Book book2 = new Book("las dos torres",
         "segundo libro del señor de los anillo", "J.R Tolkien");
         bookService.addBook(book2);
         try {Thread.sleep(1000);        
         } catch (InterruptedException e) {
        }
         Book book3 = new Book("las dos torres",
         "tercero libro del señor de los anillo", "J.R Tolkien");
         bookService.addBook(book3);
         Book book4 = new Book("cruces sobre el agua",
         "libro ecuatoriano", "oswaldo");
         bookService.addBook(book4);

    }
}
