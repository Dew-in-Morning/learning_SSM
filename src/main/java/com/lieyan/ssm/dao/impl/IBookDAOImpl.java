package com.lieyan.ssm.dao.impl;

import com.lieyan.ssm.dao.IBookDAO;
import com.lieyan.ssm.pojo.BookInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class IBookDAOImpl implements IBookDAO {
    @Override
    public List<BookInfo> getBooks() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //工厂构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //构建工厂
        SqlSessionFactory factory = builder.build(is);
        SqlSession session = factory.openSession();
        List<BookInfo> list = session.selectList("getBooks");
        return list;
    }
}
