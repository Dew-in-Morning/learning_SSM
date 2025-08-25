package com.lieyan.service.impl;

import com.lieyan.dao.MPDao;
import com.lieyan.service.MPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MPServiceImpl implements MPService {
    @Autowired
    MPDao mpDao;

}
