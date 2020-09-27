package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Function;
import com.ujiuye.pro.mapper.FunctionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 11:32
 */
@Service
public class FunctionServiceImpl implements  FunctionService {


    @Resource
    private FunctionMapper functionMapper;

    @Override
    public List<Function> showFunctions() {
        return functionMapper.showFunctions();
    }

    @Override
    public boolean saveInfo(Function function) {
        return functionMapper.insert( function);
    }

    @Override
    public List<Function> getFuncByMid(int mid) {
        return functionMapper.getFuncByMid(mid);
    }
}
