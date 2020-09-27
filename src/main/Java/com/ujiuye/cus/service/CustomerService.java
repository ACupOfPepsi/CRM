package com.ujiuye.cus.service;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 16:34
 */
public interface CustomerService {

    //添加用户方法
    boolean saveCustomer(Customer customer);

    //查询方法、分页
    List<Customer> pageList(CustomerVo vo);

    //查看详情、展示一个用户信息
    Customer getOneById(Integer id);

    //更新数据方法
    boolean updateInfo(Customer customer);

    //多个删除
    boolean bachDelete(List<Integer> list);
}
