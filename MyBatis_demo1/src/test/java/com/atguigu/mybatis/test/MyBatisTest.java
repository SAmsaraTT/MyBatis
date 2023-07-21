package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/6 21:46
 * @Version 1.0
 */
public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //load config

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // get the Factor

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //get the sqlSession

        SqlSession sqlSession = sqlSessionFactory.openSession(true);


        // get the mapper

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);



        // test the func
        int ret = mapper.insertUser();

        // commit the transaction
//        sqlSession.commit();
        System.out.println("result: " + ret);

    }

    @Test
    public void testCRUD() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resource);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //mapper.updateUser();
//        mapper.deleteUser();
//        User userById = mapper.getUserById();
        var list = mapper.getAllUser();

        list.forEach(System.out::println);

    }
}
