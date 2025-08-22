package com.lieyan.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {
    private Integer id;
    private String name;
    private String author;
    private String bookdesc;
    private Double price;
}
