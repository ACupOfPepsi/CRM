package com.ujiuye.pro.mapper;

import com.ujiuye.pro.bean.Module;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 16:38
 */
public interface ModuleMapper {
    List<Module> showAllModule();

    int insert(Module module);

    //被关联的查询
    Module selectByPrimaryKey1 (int id);

    //根据需求外键查询全部module
    List<Module> selectByAnFk (int id);
}
