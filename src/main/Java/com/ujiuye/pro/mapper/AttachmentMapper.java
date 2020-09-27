package com.ujiuye.pro.mapper;

import com.ujiuye.pro.bean.Attachment;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 16:38
 */
public interface AttachmentMapper {
    List<Attachment> showAllInfo();

    int insert(Attachment attachment);
}
