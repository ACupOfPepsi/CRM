package com.ujiuye.pro.controller;

import com.ujiuye.pro.bean.Module;
import com.ujiuye.pro.service.ModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 9:53
 */
@Controller
@RequestMapping("/module")
public class ModuleController {

    @Resource
    private ModuleService moduleService;

    //查询所有module
    @RequestMapping("showAllModule")
    @ResponseBody
    List<Module> showAllModule(){

        return moduleService.showAllModule();

    }


    //添加模块信息
    @RequestMapping("saveInfo")
    public String saveInfo (Module module){
        boolean b = moduleService.saveInfo(module);
        if(b){
            return "redirect:/project-model.jsp";
        }else {
            return "error";
        }
    }
}
