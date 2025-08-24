package com.lieyan;

import com.lieyan.Service.BookService;
import com.lieyan.Service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
