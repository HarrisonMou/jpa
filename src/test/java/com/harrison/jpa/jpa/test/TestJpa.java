package com.harrison.jpa.jpa.test;

import com.harrison.jpa.jpa.BaseTest;
import com.harrison.jpa.study.controller.UserController;
import com.harrison.jpa.study.dao.UserDao;
import com.harrison.jpa.study.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestJpa extends BaseTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserController userController;

    @Test
    public void test1(){
        Long id = 1L;
        User user = userController.findById(id);
        System.out.println(user);
    }

    @Test
    public void test2(){
        User user = new User();
        user.setName("msl");
        user.setPhone("15681931230");
        user.setAddr("上海浦东");
        user.setStatus(1);
        User save = userDao.save(user);
        System.out.println(save);
    }
}
