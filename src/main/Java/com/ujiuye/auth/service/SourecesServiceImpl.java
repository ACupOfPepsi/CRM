package com.ujiuye.auth.service;

import com.ujiuye.auth.bean.Sources;
import com.ujiuye.auth.mapper.SourcesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-18 17:31
 */
@Service
public class SourecesServiceImpl implements SourcesService{

    @Resource
    private SourcesMapper sourcesMapper;

    @Override
    public Sources getRootSources() {
        //查根节点
        Sources sources =  sourcesMapper.getRootSources();

        sources.setOpen(true);

        return getChild(sources);
    }

    @Override
    public boolean addSources(Sources sources) {
        return sourcesMapper.insert(sources)>0;
    }

    @Override
    public Sources showOneById(int id) {
        return sourcesMapper.selectByPrimaryKey(id);
    }

    //递归查询所有的子节点
    public Sources getChild(Sources sources){
        //拿到父节点的id 查询子节点
        List<Sources> child = sourcesMapper.getChild(sources.getId());
        if (child!=null&&child.size()>0){
            sources.setChildren(child);
            for (int i=0;i<child.size();i++){
                Sources sources1 = child.get(i);
                getChild(sources1);
            }
        }
        return  sources;
    }
}
