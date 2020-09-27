package com.ujiuye.emp.service;

import com.ujiuye.emp.bean.Employee;
import com.ujiuye.emp.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-01 14:59
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Employee login(String username, String pass) {
        Employee login = employeeMapper.login(username, pass);
        return login;
    }

    @Override
    public List<Employee> showManagerInfo(int pFk) {
        return employeeMapper.showPM(pFk);
    }

    @Override
    public List<Employee> showEmp() {
        return employeeMapper.showEmp();
    }

    @Override
    public List<Employee> showEmpAndArchives() {
        return employeeMapper.showEmpAndArchives();
    }
}
