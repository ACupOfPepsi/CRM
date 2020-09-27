package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Baoxiao;
import com.ujiuye.usual.bean.Baoxiaoreply;
import com.ujiuye.usual.mapper.BaoxiaoMapper;
import com.ujiuye.usual.mapper.BaoxiaoreplyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 14:52
 */
@Service
public class BaoxiaoServiceImpl implements BaoxiaoService {

    @Resource
    private BaoxiaoMapper baoxiaoMapper;

    @Resource
    private BaoxiaoreplyMapper baoxiaoreplyMapper;

    @Override
    public List<Baoxiao> getAllBaoxiao() {
        return baoxiaoMapper.getAllBaoxiao();
    }

    @Override
    public Baoxiao getOneBaoxiaoById(String bxid) {
        return baoxiaoMapper.getOneBaoxiaoById(bxid);
    }

    @Override
    public boolean shenpi(Baoxiao baoxiao, String content) {
        //改变报销状态
       boolean b =  baoxiaoMapper.updateByPrimaryKeySelective(baoxiao)>0;

       //创建批注信息对象 添加到批注中
        Baoxiaoreply baoxiaoreply = new Baoxiaoreply();
        baoxiaoreply.setBaoxiaoFk(baoxiao.getBxid());
        baoxiaoreply.setContent(content);
        boolean b1 = baoxiaoreplyMapper.insert(baoxiaoreply)>0;

        if (b && b1){
            return true;
        }

        return false;
    }

    @Override
    public List<Baoxiao> getBaoxiaoByEid() {
        //redis中获取当前用户的eid
        List<Baoxiao> baoxiaos = baoxiaoMapper.getBaoxiaoByEid(1);
        return baoxiaos;
    }

    @Override
    public Baoxiao showBaoxiaoAndEx(String bxid) {
        return baoxiaoMapper.showBaoxiaoAndEx(bxid);
    }

    @Override
    public boolean updateBaoxiao(Baoxiao baoxiao) {
        return baoxiaoMapper.updateByPrimaryKeySelective(baoxiao)>0;
    }

    @Override
    public boolean saveInfo(Baoxiao baoxiao) {



        return baoxiaoMapper.insert(baoxiao)>0;
    }
}
