package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/11 16:04
 * @Version 1.0
 */
public interface SelectMapper {
    /**
    * @Description: query the user by its id
    * @Param: [id]
    * @return: com.atguigu.mybatis.pojo.User
    * @Author: hliu
    * @Date: 2023/7/11
    */
    List<User> getUserById(@Param("id") Integer id);

    /**
    * @Description: query the information of all users
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.User>
    * @Author: hliu
    * @Date: 2023/7/11
    */
    List<User> getAllUser();

    /**
    * @Description: query the number of users
    * @Param: []
    * @return: java.lang.Integer
    * @Author: hliu
    * @Date: 2023/7/11
    */
    Integer getCount();

    /**
    * @Description: query the user by id(Map)
    * @Param: []
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    * @Author: hliu
    * @Date: 2023/7/11
    */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
    * @Description: query all users (map)
    * @Param: []
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    * @Author: hliu
    * @Date: 2023/7/11
    */
//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
