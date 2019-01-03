package com.harrison.jpa.study.service;

import com.harrison.jpa.study.dao.UserDao;
import com.harrison.jpa.study.domain.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMqService {

    @Autowired
    private UserDao userDao;

    @RabbitListener(queues = "harrison.user.direct.user")
    public void saveUser(User user){
        System.out.println("监听到消息队列有消息");
        User save = userDao.save(user);
        System.out.println("保存到消息队列的值");
    }
}
