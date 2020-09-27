package com.ujiuye.pro.controller;

import com.ujiuye.pro.bean.Project;
import com.ujiuye.pro.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-06 10:17
 */
@Controller
@RequestMapping("/pro")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    //查询全部
    @RequestMapping("showAllProInfo")
    @ResponseBody
    public List<Project> showAllProInfo(){
        return projectService.showAllProInfo();
    }

    //添加
    @RequestMapping(value = "savePro" , method = RequestMethod.POST)
    public String savePro(Project project,String newcomname){
        //获取前端newcomname，将获取的string类型的newcomname截取成数组并获取第一个为id ，转为int类型，存入project
        project.setComname(Integer.parseInt(newcomname.split(",")[0]));
        boolean b = projectService.savepro(project);
        return "project-base";
    }

    //显示没有添加过需求的项目
    @RequestMapping("showNoAnalysisInfo")
    @ResponseBody
    public List<Project> showNoAnalysisInfo (){

        return projectService.showNoAnalysisInfo();
    }

    //显示有需求的项目
    @RequestMapping("showProHasAnalysis")
    @ResponseBody
    public List<Project> showProHasAnalysis (){
        return projectService.showProHasAnalysis();
    }

    //显示有需求有模块
    @RequestMapping("showProHasAsisAndModule")
    @ResponseBody
    public List<Project> showProHasAsisAndModule (){
        return projectService.showProHasAsisAndModule();
    }

    //有模块、模块下有功能、功能没有被分配任务
    @RequestMapping("showProWithFunction")
    @ResponseBody
    public List<Project> showProWithFunction (){
        return projectService.showProWithFunction();
    }
}
