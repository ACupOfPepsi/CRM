package com.ujiuye.pro.controller;

import com.ujiuye.pro.bean.Analysis;
import com.ujiuye.pro.service.AnalysisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-06 15:29
 */
@Controller
@RequestMapping("/analysis")
public class AnalysisController {

    @Resource
    private AnalysisService analysisService;

    //查询全部需求
    @RequestMapping("showAllInfo")
    @ResponseBody
    public List<Analysis> showAllInfo (){

        return analysisService.showAllInfo();
    }

    @RequestMapping(value = "saveInfo",method = RequestMethod.POST)
    public String saveInfo (Analysis analysis, MultipartFile file){

        //上传需求文档
        //文件上传目录
        String path = "E:\\analysis\\";
        if (file.getSize()>0){
            //完整路径=上传目录+文件路径
            path+=file.getOriginalFilename();
            File file1 = new File(path);

            //文件上传
            try {
                file.transferTo(file1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //添加需求到数据库
        analysis.setProname(path);
        boolean b =  analysisService.saveAnalysis(analysis);
        if(b){
            return "project-need";
        }else {
            return "error";
        }

    }

    //  获取项目对应的需求
    @RequestMapping("getAnaInfo")
    @ResponseBody
    public Analysis getAnaInfo (int pid){
        return analysisService.getAnaInfo(pid);
    }

}
