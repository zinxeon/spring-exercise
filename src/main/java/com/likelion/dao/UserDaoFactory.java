package com.likelion.dao;

import com.likelion.domain.User;

public class UserDaoFactory {

    public UserDao awsUserDao() {

        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

}
