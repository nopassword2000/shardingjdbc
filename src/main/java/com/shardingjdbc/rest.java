package com.shardingjdbc;

import com.shardingjdbc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/jdbc")
public class rest {

    @Autowired
    UserDao userDao;
    @GetMapping("/add")
    public String add(){

        for (int i = 0; i < 10; i++) {
            Long id = i + 1L;
            userDao.insertUser(id, "姓名" + id);
        }

        return "ok";
    }
}
