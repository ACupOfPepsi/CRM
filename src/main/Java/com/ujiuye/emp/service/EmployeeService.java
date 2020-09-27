package com.ujiuye.emp.service;

import com.ujiuye.emp.bean.Employee;
import com.ujiuye.usual.bean.Expendituretype;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 14:51
 */
public interface EmployeeService {
    //登录方法:返回值==员工对象  参数：账号，密码
    Employee login(String username,String pass);

    //显示项目经理
    List<Employee> showManagerInfo(int pFk);

    List<Employee> showEmp();

    List<Employee> showEmpAndArchives();
}
