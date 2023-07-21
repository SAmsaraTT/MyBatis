package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/17 22:17
 * @Version 1.0
 */
public interface DynamicSQLMapper {
    /**
    * @Description: query by multi-parameters
    * @Param: []
    * @return: java.util.List<com.atguigu.mybatis.pojo.Emp>
    * @Author: hliu
    * @Date: 2023/7/17
    */
   List<Emp> getEmpByCondition(Emp emp);

   /**
   * @Description: choose when otherwise
   * @Param: [emp]
   * @return: java.util.List<com.atguigu.mybatis.pojo.Emp>
   * @Author: hliu
   * @Date: 2023/7/18
   */
   List<Emp> getEmpByChoose(Emp emp);

   /**
   * @Description: for each (delete)
   * @Param: [eids]
   * @return: int
   * @Author: hliu
   * @Date: 2023/7/18
   */
   int deleteMoreByArray(@Param("eids") Integer[] eids);

   /**
   * @Description: for each (insert)
   * @Param: [emps]
   * @return: int
   * @Author: hliu
   * @Date: 2023/7/18
   */
   int insertMoreByList(@Param("emps") List<Emp> emps);
}
