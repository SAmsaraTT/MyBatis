package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/6 21:33
 * @Version 1.0
 */
public interface UserMapper {

    /**
    * @Description: add User
    * @Param: []
    * @return: int
    * @Author: hliu
    * @Date: 2023/7/6
    */
    int insertUser();


    /**
    * @Description: update user
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/7/7
    */
    void updateUser();

    /**
    * @Description: delete user
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/7/7
    */
    void deleteUser();
    /**
    * @Description: get user by id
    * @Param: []
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/7
    */
    User getUserById();

    /**
    * @Description: get all users
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.User>
    * @Author: hliu
    * @Date: 2023/7/7
    */
    List<User> getAllUser();
}
