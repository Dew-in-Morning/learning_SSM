package com.lieyan;

//import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.lieyan.dao.MPDao;
import com.lieyan.pojo.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
	@Autowired
	MPDao mpDao;

	@Test
	void contextLoads() {
		System.out.println(("----- selectAll method test ------"));
		List<Course> courseList = mpDao.selectList(null);
		Assert.isTrue(8 == courseList.size(), "");
		courseList.forEach(System.out::println);
	}

}
