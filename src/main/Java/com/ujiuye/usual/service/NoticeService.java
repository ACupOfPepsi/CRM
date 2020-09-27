package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Notice;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 10:41
 */
public interface NoticeService {
    List<Notice> showAll();

    boolean saveNotice(Notice notice);

    List<Notice> showMainPage();

    Notice showOneInfo(int nid);
}
