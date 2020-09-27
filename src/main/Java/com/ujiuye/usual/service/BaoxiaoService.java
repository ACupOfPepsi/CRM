package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Baoxiao;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 14:52
 */
public interface BaoxiaoService {
    List<Baoxiao> getAllBaoxiao();

    Baoxiao getOneBaoxiaoById(String bxid);

    boolean shenpi(Baoxiao baoxiao, String content);

    List<Baoxiao> getBaoxiaoByEid();

    Baoxiao showBaoxiaoAndEx(String bxid);

    boolean updateBaoxiao(Baoxiao baoxiao);

    boolean saveInfo(Baoxiao baoxiao);
}
