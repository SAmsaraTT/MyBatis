package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/9 19:25
 * @Version 1.0
 */
public interface ParameterMapper {
    /**
    * @Description: get all users
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.User>
    * @Author: hliu
    * @Date: 2023/7/9
    */
    List<User> getAllUser();


    /**
    * @Description: get user by its username
    * @Param: [username]
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/10
    */
    User getUserByUsername(String username);


    /**
    * @Description: check the user to login
    * @Param: [username, password]
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/10
    */
    User checkLogin(String username, String password);

    /**
    * @Description: check the user to login (Map)
    * @Param: [map]
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/10
    */
    User checkLoginByMap(Map<String, Object> map);

    /**
    * @Description: insert user into table
    * @Param: [user]
    * @return: int
    * @Author: hliu
    * @Date: 2023/7/10
    */
    int insertUser(User user);



    /**
    * @Description: check the login user by @Param
    * @Param: [username, password]
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/10
    */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
