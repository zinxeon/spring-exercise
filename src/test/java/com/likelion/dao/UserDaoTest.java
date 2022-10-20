package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndGet() {
        // UserDao userDao = new UserDao(new AWSConnectionMaker());
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("4","b","1123");
        userDao.add(user);

        User selectedUser = userDao.get("1");
        Assertions.assertEquals("aa", selectedUser.getName());
    }
}