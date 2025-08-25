package com.lieyan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lieyan.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface MPDao extends BaseMapper<Course> {
}
