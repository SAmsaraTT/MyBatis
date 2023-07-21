package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/12 17:17
 * @Version 1.0
 */
public class SQLMapperTest {
    @Test
    public void getUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        List<User> list = mapper.getUserByLike("a");

        System.out.println(list);
    }

    @Test
    public void deleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        int ret = mapper.deleteMore("1,2,3");

        System.out.println(ret);
    }

    @Test
    public void getUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> tUser = mapper.getUserByTableName("t_user");

        System.out.println(tUser);
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        User user = new User(null, "Mercy", "123", 23, "女", "skulllht@gmail.com");
        mapper.insertUser(user);

        System.out.println(user);
    }
}