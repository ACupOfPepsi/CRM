package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Attachment;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-08 9:54
 */
public interface AttachmentService {
    List<Attachment> showAllInfo();

    boolean saveInfo(Attachment attachment);
}
