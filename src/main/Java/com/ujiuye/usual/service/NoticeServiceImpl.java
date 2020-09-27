package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Notice;
import com.ujiuye.usual.mapper.NoticeMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 10:41
 */
@Service
public class NoticeServiceImpl implements  NoticeService {

    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> showAll() {
        return noticeMapper.showAll();
    }

    @Override
    public boolean saveNotice(Notice notice) {
        return noticeMapper.insert(notice)>0;
    }

    @Override
    public List<Notice> showMainPage() {
        return noticeMapper.showMainPage();
    }

    @Override
    public Notice showOneInfo(int nid) {
        return noticeMapper.selectByPrimaryKey(nid);
    }
}
