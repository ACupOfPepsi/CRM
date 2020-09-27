package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Email;
import com.ujiuye.usual.mapper.EmailMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ACupOfPepsi
 * @create 2020-07-10 16:41
 */
@Service
public class EmailServiceImpl implements EmailService {

    @Resource
    private EmailMapper emailMapper;

    @Override
    public int saveEmailMsg(Email email) {
        return emailMapper.insertSelective(email);
    }
}
