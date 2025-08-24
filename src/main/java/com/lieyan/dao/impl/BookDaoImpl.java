package com.lieyan.dao.impl;

import com.lieyan.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("Dao save...");
    }
}
