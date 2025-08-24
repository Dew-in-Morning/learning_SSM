package com.lieyan.dao.impl;

import com.lieyan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("bookconstructor is running...");
    }

    @Override
    public void save() {
        int i = 3;
        while (i-- != 0) {
            System.out.println("Dao save...");
        }
        System.out.println("Dao end!");
    }
}
