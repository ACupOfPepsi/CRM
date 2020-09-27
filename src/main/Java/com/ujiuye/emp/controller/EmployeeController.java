package com.ujiuye.emp.controller;

import com.ujiuye.emp.bean.Employee;
import com.ujiuye.emp.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 14:45
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

//    @Resource
//    private JedisPool jedisPool;

    //处理登陆请求方法
    @RequestMapping("login")
    public String login(String name,String pass){
        Employee login = employeeService.login(name,pass);
        if (login!=null){
//            Jedis resource = jedisPool.getResource();
//            resource.set
            return "redirect:/index.jsp";
        }else {
            return "redirect:/login.jsp";
        }

    }

    //处理退出登录的方法
    @RequestMapping("logout")
    public String logout(){
        //            Jedis resource = jedisPool.getResource();
//            resource.del
        return "redirect:/login.jsp";
    }

    //显示所有项目负责人信息
    @RequestMapping("showManagerInfo")
    @ResponseBody
    public List<Employee> showManagerInfo(int pFk){
        return employeeService.showManagerInfo(pFk);
    }

    @RequestMapping("showEmp")
    @ResponseBody
    public List<Employee> showEmp(){
        List<Employee> employees = employeeService.showEmp();
        return employees;
    }

    //返回员工带档案
    @RequestMapping("showEmpAndArchives")
    @ResponseBody
    public List<Employee> showEmpAndArchives (){
        return employeeService.showEmpAndArchives();
    }

}
