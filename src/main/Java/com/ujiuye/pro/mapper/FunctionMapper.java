package com.ujiuye.pro.mapper;

import com.ujiuye.pro.bean.Function;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 16:38
 */
public interface FunctionMapper {
    List<Function> showFunctions();

    boolean insert(Function function);

    List<Function> getFuncByMid(int mid);
}
