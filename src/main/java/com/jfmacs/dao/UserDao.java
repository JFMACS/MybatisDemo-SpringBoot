package com.jfmacs.dao;

import com.jfmacs.pojo.User;

import java.util.List;

/**
 * @author JFMACS
 */
public interface UserDao {

    List<User> selectAllUser();
}
