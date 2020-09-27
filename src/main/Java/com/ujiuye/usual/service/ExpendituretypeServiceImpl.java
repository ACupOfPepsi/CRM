package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Expendituretype;
import com.ujiuye.usual.mapper.ExpendituretypeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 15:01
 */
@Service
public class ExpendituretypeServiceImpl implements ExpendituretypeService {

    @Resource
    private ExpendituretypeMapper expendituretypeMapper;

    @Override
    public List<Expendituretype> showAllExp() {
        return expendituretypeMapper.showAllExp();
    }
}
