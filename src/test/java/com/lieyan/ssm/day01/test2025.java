package com.lieyan.ssm.day01;

import com.lieyan.ssm.dao.IBookDAO;
import com.lieyan.ssm.dao.impl.IBookDAOImpl;
import com.lieyan.ssm.pojo.BookInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

public class test2025 {
    @Test
    public void testAll() throws Exception {
        IBookDAO dao = new IBookDAOImpl();
        List<BookInfo> list = dao.getBooks();
        for (BookInfo bookInfo : list) {
            System.out.println(bookInfo.getName());
        }
    }
}
