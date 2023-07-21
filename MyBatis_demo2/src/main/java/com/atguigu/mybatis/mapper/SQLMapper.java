package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/12 17:13
 * @Version 1.0
 */
public interface SQLMapper {

    /**
    * @Description: using like to query
    * @Param: [username]
    * @return: java.util.List<com.atguigu.mybatis.pojo.User>
    * @Author: hliu
    * @Date: 2023/7/12
    */
    List<User> getUserByLike(@Param("username") String username);

    /**
    * @Description: delete more than one record
    * @Param: [ids]
    * @return: int
    * @Author: hliu
    * @Date: 2023/7/12
    */
    int deleteMore(@Param("ids") String ids);
    
    /**
    * @Description: query users by table name
    * @Param: [tableName]
    * @return: java.util.List<com.atguigu.mybatis.pojo.User>
    * @Author: hliu
    * @Date: 2023/7/12
    */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
    * @Description:
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/7/13
    */
    void insertUser(User user);
}
