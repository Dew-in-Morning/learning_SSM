package com.lieyan.Service.impl;

import com.lieyan.Service.BookService;
import com.lieyan.dao.BookDao;
import com.lieyan.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("Service save...");
        bookDao.save();
    }
}
