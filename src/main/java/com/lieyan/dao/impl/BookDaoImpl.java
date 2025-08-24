package com.lieyan.dao.impl;

import com.lieyan.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl(){
        System.out.println("bookconstructor is running...");
    }
    @Override
    public void save() {
        System.out.println("Dao save...");
    }
}
