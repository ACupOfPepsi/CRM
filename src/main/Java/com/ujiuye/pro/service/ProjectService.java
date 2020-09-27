package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Project;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-06 10:19
 */
public interface ProjectService {
    List<Project> showAllProInfo();

    boolean savepro(Project project);

    List<Project> showNoAnalysisInfo();

    List<Project> showProHasAnalysis();

    List<Project> showProHasAsisAndModule();

    List<Project> showProWithFunction();
}
