package com.lieyan.ssm.dao;

import com.lieyan.ssm.pojo.BookInfo;

import java.util.List;

public interface IBookDAO {
    public List<BookInfo> getBooks() throws Exception;
}
