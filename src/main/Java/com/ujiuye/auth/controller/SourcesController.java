package com.ujiuye.auth.controller;

import com.ujiuye.auth.bean.Sources;
import com.ujiuye.auth.service.SourcesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author ACupOfPepsi
 * @create 2020-07-18 17:27
 */
@Controller
@RequestMapping("/auth")
public class SourcesController {

    @Resource
    private SourcesService sourcesService;

    //异步加载tree节点
    @RequestMapping("getRootSources")
    @ResponseBody
    public Sources getRootSources(){
        Sources rootSources = sourcesService.getRootSources();
        return rootSources;
    }

    //添加权限
    @RequestMapping("addSources")
    public String addSources(Sources sources){
        boolean b = sourcesService.addSources(sources);
        if (b){
            return "redirect:/pm.jsp";
        }else {
            return "error";
        }
    }

    @RequestMapping("showOneById")
    @ResponseBody
    public Sources showOneById(int id){
        System.err.println(id);
        return sourcesService.showOneById(id);
    }

}
