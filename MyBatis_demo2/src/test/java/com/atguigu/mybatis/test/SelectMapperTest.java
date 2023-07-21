package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/11 16:19
 * @Version 1.0
 */
public class SelectMapperTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserById(3));
    }

    @Test
    public void getAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getAllUser());
    }

    @Test
    public void getCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getCount());
    }

    @Test
    public void getUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserByIdToMap(3));
    }

    @Test
    public void getAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getAllUserToMap());
    }


}