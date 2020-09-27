package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Module;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 9:57
 */
public interface ModuleService {
    List<Module> showAllModule();

    boolean saveInfo(Module module);
}
