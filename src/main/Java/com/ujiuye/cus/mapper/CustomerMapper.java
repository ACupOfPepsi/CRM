package com.ujiuye.cus.mapper;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 16:29
 */
public interface CustomerMapper {

    //添加用户方法
    int insert (Customer customer);

    //查询全部方法、分页
    List<Customer> pageList(CustomerVo vo);

    //查看详情、展示一个用户信息、根据id查询
    Customer selectByPrimaryKey(Integer id);

    //更新方法
    int updateByPrimaryKeySelective(Customer customer);

    //批量删除
    int bachDelete(List<Integer> list);
}
