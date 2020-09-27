package com.ujiuye.usual.controller;

import com.ujiuye.emp.service.EmployeeService;
import com.ujiuye.usual.bean.Expendituretype;
import com.ujiuye.usual.service.ExpendituretypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 15:00
 */
@Controller
@RequestMapping("/ext")
public class ExpendituretypeController {

    @Resource
    private ExpendituretypeService expendituretypeService;

    //查询全部报销类型
    @RequestMapping("showAllExp")
    @ResponseBody
    public List<Expendituretype> showAllExp (){
        return expendituretypeService.showAllExp();
    }

}
