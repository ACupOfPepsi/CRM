package com.ujiuye.pro.mapper;

import com.ujiuye.pro.bean.Project;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 16:38
 */

public interface ProjectMapper {

    //关联查询方法
    List<Project> getAllProInfo();

    //添加方法
    int insert(Project project);

    //id查询
    Project selectByPrimaryKey (int pid);

    List<Project> showNoAnalysisInfo();

    List<Project> showProHasAnalysis();

    List<Project> showProHasAsisAndModule();

    //返回有模块、模块下有功能、功能没有被分配
    List<Project> showProWithFunction ();
}
