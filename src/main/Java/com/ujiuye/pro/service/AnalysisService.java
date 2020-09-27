package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Analysis;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-06 15:57
 */
public interface AnalysisService {
    public List<Analysis> showAllInfo();

    boolean saveAnalysis(Analysis analysis);

    Analysis getAnaInfo(int pid);
}
