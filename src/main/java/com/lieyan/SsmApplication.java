package com.lieyan;

import com.lieyan.Service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SsmApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SsmApplication.class, args);

        // 测试依赖注入
        BookService bookService = context.getBean(BookService.class);
        bookService.save("aa",2);
    }
}
