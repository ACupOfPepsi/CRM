package com.ujiuye.cus.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;
import com.ujiuye.cus.service.CustomerService;
import com.ujiuye.util.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 16:39
 */
@Controller
@RequestMapping("/cus")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    //处理添加请求
    @RequestMapping("saveCustomer")
    public String saveCustomer(Customer customer){
        customer.setAddtime(new Date());
        boolean b = customerService.saveCustomer(customer);

        if(b){
            return "customer";
        }else {
            return "error";
        }
    }

    //分页查询方法
    @RequestMapping("showInfo")
    @ResponseBody
    public PageInfo<Customer> showInfo(@RequestParam(value = "currentpage") Integer pageNum,CustomerVo vo){
        //分页+排序时需要在开启分页时传入排序参数
//        System.err.println(keyindex);
//        vo.setKeyIndex(keyindex);
        System.out.println(vo);
        if (vo.getNum() == 1){
            //开启分页 带排序
            String orderBy = "id desc";
            //要求pageHelper 5.0以上版本
            PageHelper.startPage(pageNum,2,orderBy);
        }else {
            //不需要排序
            PageHelper.startPage(pageNum,2);
        }
        //获取数据源
        List<Customer> customers = customerService.pageList(vo);
        //分页处理数据源
        PageInfo<Customer> pageInfo = new PageInfo<>(customers);

        System.out.println(pageInfo.getList());

        return pageInfo;
    }

    //查看详情、展示一个用户信息
    @RequestMapping("getOneInfo")
    @ResponseBody
    public Customer getOneInfo(Integer id){
        return customerService.getOneById(id);
    }

    //更新方法
    @RequestMapping("updateInfo")
    public String updateInfo (Customer customer){

        //customer.setAddtime(new Date());

        boolean b = customerService.updateInfo(customer);

        if (b){
            return "customer";
        }else {
            return "error";
        }
    }

    //批量删除
    @RequestMapping("bachDelete")
    @ResponseBody
    public ResultInfo bachDelete(String ids){
        //System.out.println(ids);
        //list集合是执行批量删除的条件
        List<Integer> list = new ArrayList<>();
        for (String id:ids.split(",")){
            list.add(Integer.parseInt(id));
        }

        //service 执行删除
        boolean b =  customerService.bachDelete(list);

        ResultInfo ri = new ResultInfo();
        if(b){
            ri.setFlag(true);
        }

            return  ri;
    }

    @RequestMapping("showAllInfo")
    @ResponseBody
    public List<Customer> showAllInfo (){
        return customerService.pageList(null);
    }
}
