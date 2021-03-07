package com.shardingjdbc;

import com.shardingjdbc.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@SpringBootTest
class ShardingjdbcApplicationTests {

    //@Test
    public void contextLoads() {
    }


    //@Test
    public void testInsertUser() {
        for (int i = 0; i < 10; i++) {
            Long id = i + 1L;
            //userDao.insertUser(id, "姓名" + id);
        }
    }

  //  @Test
    public void testSelectUserbyIds() {
        List<Long> userIds = new ArrayList<>();
        userIds.add(1L);
        userIds.add(2L);
      //  List<Map> users = userDao.selectUserbyIds(userIds);
        //System.out.println(users);
    }
}
