package com.jfmacs.service;

import com.jfmacs.pojo.User;
import com.jfmacs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JFMACS
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectAllUser(){
        return userDao.selectAllUser();
    }
}
