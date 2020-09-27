package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Function;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 11:32
 */
public interface FunctionService {
    List<Function> showFunctions();

    boolean saveInfo(Function function);

    List<Function> getFuncByMid(int mid);
}
