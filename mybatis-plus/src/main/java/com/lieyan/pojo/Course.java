package com.lieyan.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course")
public class Course {
    @Override
    public String toString() {
        return "Course{" +
                "Cno=" + Cno +
                ", Cname='" + Cname + '\'' +
                ", Ccredit=" + Ccredit +
                ", Cpno=" + Cpno +
                '}';
    }

    private Integer Cno;
    private String Cname;
    private Integer Ccredit;
    private Integer Cpno;
}
