package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/17 22:27
 * @Version 1.0
 */
public class DynamicSQLMapperTest {
    @Test
    public void getEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(new Emp(null, "张三", null, "", "hliu714@gatech.edu"));

        System.out.println(empByCondition);
    }

    @Test
    public void getEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByChoose = mapper.getEmpByChoose(new Emp(null, "张三", null, "", ""));

        System.out.println(empByChoose);
    }



    @Test
    public void deleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{6, 7, 8});

        System.out.println(i);

    }

    @Test
    public void insertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "hliu714@gatech.edu");
        Emp emp2 = new Emp(null, "a2", 23, "男", "hliu714@gatech.edu");
        Emp emp3 = new Emp(null, "a3", 23, "男", "hliu714@gatech.edu");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        int i = mapper.insertMoreByList(list);

        System.out.println(i);

    }

}
