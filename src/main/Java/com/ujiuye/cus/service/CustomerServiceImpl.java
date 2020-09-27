package com.ujiuye.cus.service;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;
import com.ujiuye.cus.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 16:36
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public boolean saveCustomer(Customer customer) {

        int insert = customerMapper.insert(customer);

        return insert>0;
    }

    @Override
    public List<Customer> pageList(CustomerVo vo) {
        return customerMapper.pageList(vo);
    }

    //查看详情、展示一个用户信息
    @Override
    public Customer getOneById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    //更新方法
    @Override
    public boolean updateInfo(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer)>0;
    }

    @Override
    public boolean bachDelete(List<Integer> list) {

        return customerMapper.bachDelete(list)>0;
    }
}
