package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/13 18:17
 * @Version 1.0
 */
public interface EmpMapper {
    /**
    * @Description: query all emp
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.Emp>
    * @Author: hliu
    * @Date: 2023/7/13
    */
    List<Emp> getAllEmp();

    /**
    * @Description: query the emp and his dept by its id
    * @Param: []
    * @return: com.atguigu.mybatis.pojo.Emp
    * @Author: hliu
    * @Date: 2023/7/14
    */
    Emp getEmpAndDept(@Param("eid") Integer id);

    /**
    * @Description: step 1
    * @Param: []
    * @return: com.atguigu.mybatis.pojo.Emp
    * @Author: hliu
    * @Date: 2023/7/16
    */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
    * @Description: query the emp in dept step2
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.Emp>
    * @Author: hliu
    * @Date: 2023/7/17
    */
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
    
}
