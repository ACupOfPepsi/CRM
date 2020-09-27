package com.ujiuye.pro.service;

import com.ujiuye.pro.bean.Attachment;
import com.ujiuye.pro.mapper.AttachmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-08 9:54
 */
@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Resource
    private AttachmentMapper attachmentMapper;

    @Override
    public List<Attachment> showAllInfo() {
        return attachmentMapper.showAllInfo();
    }

    @Override
    public boolean saveInfo(Attachment attachment) {
        return attachmentMapper.insert(attachment)>0;
    }
}
