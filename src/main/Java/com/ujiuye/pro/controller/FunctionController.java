package com.ujiuye.pro.controller;

import com.ujiuye.pro.bean.Function;
import com.ujiuye.pro.service.FunctionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 11:30
 */
@Controller
@RequestMapping("/function")
public class FunctionController {

    @Resource
    private FunctionService functionService;

    //查询功能管理
    @RequestMapping("showFunctions")
    @ResponseBody
    public List<Function> showFunctions (){
        List<Function> functions = functionService.showFunctions();


        return  functions;
    }

    //添加方法
    @RequestMapping("saveInfo")
    public String saveInfo(Function function){
        boolean b =  functionService.saveInfo(function);
        if (b){
            return "redirect:/project-function.jsp";
        }else {
            return "error";
        }
    }

    //
    @RequestMapping("getFuncByMid")
    @ResponseBody
    public List<Function> getFuncByMid (int mid){
        List<Function> functions = functionService.getFuncByMid(mid);
        return functions;
    }
}
