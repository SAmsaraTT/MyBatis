package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/9 19:51
 * @Version 1.0
 */
public class ParameterMapperTest {
   @Test
    public void testGetAllUser() {
       SqlSession sqlSession = SqlSessionUtils.getSqlSession();
       ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

       List<User> allUser = mapper.getAllUser();

       allUser.forEach(System.out::println);
   }


   /*
   mybatis -> ${} #{}
    */

   @Test
   public void testGetUserByUsername() {
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

      User user = mapper.getUserByUsername("hliu714");

      System.out.println(user);
   }

   @Test
   public void testCheckLogin() {
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

      User user = mapper.checkLogin("hliu714", "123456");

      System.out.println(user);
   }

   @Test
   public void testCheckLoginByMap() {
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

      var map = new HashMap<String, Object>();
      map.put("username", "admin");
      map.put("password", "123456");

      User user = mapper.checkLoginByMap(map);

      System.out.println(user);
   }

   @Test
   public void testInsertUser() {
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);


      int ret = mapper.insertUser(new User(null, "simon", "123", 23, "男", "810590755@qq.com"));

      System.out.println(ret);
   }

   @Test
   public void testCheckLoginByParam() {
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

      User user = mapper.checkLoginByParam("hliu714", "123456");

      System.out.println(user);
   }


}
