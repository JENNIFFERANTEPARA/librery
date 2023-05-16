package com.example.librery.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Book {
    private String bookId;
    private String title;
    private String descripcion;
    private String autor;
    
    public Book(String title, String descripcion, String autor) {
        this.title = title;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    
}
