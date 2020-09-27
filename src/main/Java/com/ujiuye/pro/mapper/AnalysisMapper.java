package com.ujiuye.pro.mapper;

import com.ujiuye.pro.bean.Analysis;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 16:38
 */
public interface AnalysisMapper {
    List<Analysis> showAllInfo();

    int insert(Analysis analysis);

    //被module查询全部关联的主键查询，并关联project
    Analysis selectByPrimaryKey1(int id);
}
