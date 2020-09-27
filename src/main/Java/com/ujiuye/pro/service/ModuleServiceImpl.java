package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Module;
import com.ujiuye.pro.mapper.ModuleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-07 9:58
 */
@Service
public class ModuleServiceImpl implements ModuleService {

    @Resource
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> showAllModule() {
        return moduleMapper.showAllModule();
    }

    @Override
    public boolean saveInfo(Module module) {
        return moduleMapper.insert(module)>0;
    }
}
