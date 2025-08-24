package com.lieyan.Service.impl;

import com.lieyan.Service.BookService;
import com.lieyan.dao.BookDao;
import com.lieyan.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public void save(String a,int b) {
        System.out.println("Service save...");
        this.bookDao.save();
    }

}
