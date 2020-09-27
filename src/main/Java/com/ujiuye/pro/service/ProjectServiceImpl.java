package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Project;
import com.ujiuye.pro.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-06 10:20
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public List<Project> showAllProInfo() {
        return projectMapper.getAllProInfo();
    }

    @Override
    public boolean savepro(Project project) {
        return projectMapper.insert(project)>0;
    }

    @Override
    public List<Project> showNoAnalysisInfo() {
        return projectMapper.showNoAnalysisInfo();
    }

    @Override
    public List<Project> showProHasAnalysis() {
        return projectMapper.showProHasAnalysis();
    }

    @Override
    public List<Project> showProHasAsisAndModule() {
        return projectMapper.showProHasAsisAndModule();
    }

    @Override
    public List<Project> showProWithFunction() {
        return projectMapper.showProWithFunction();
    }
}
