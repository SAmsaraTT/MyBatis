package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/13 18:17
 * @Version 1.0
 */
public interface DeptMapper {
    /**
    * @Description: step 2
    * @Param: [did]
    * @return: com.atguigu.mybatis.pojo.Dept
    * @Author: hliu
    * @Date: 2023/7/16
    */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
    * @Description: query the emps by dept id
    * @Param: [did]
    * @return: com.atguigu.mybatis.pojo.Dept
    * @Author: hliu
    * @Date: 2023/7/16
    */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
    * @Description: query the emp in dept step1
    * @Param: []
    * @return: com.atguigu.mybatis.pojo.Dept
    * @Author: hliu
    * @Date: 2023/7/17
    */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
