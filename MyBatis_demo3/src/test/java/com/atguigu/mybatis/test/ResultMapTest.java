package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/13 18:40
 * @Version 1.0
 */
public class ResultMapTest {

    @Test
    public void getAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.getAllEmp();

        empList.forEach(System.out::println);
    }

    @Test
    public void getEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDept(3);

        System.out.println(emp);
    }

    @Test
    public void getEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDeptByStepOne(3);

        System.out.println(emp.getEmpName());
        System.out.println("====================================");
        System.out.println(emp.getDept());
    }

    @Test
    public void getDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmp(1);

        System.out.println(dept);
    }

    @Test
    public void getDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(1);
//        System.out.println(deptAndEmpByStepOne);
        System.out.println(deptAndEmpByStepOne.getDeptName());
    }
}