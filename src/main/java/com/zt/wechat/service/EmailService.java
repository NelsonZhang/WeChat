package com.zt.wechat.service;

import com.zt.wechat.dao.EmailMapper;
import com.zt.wechat.model.Email;
import com.zt.wechat.model.EmailExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmailService {
    @Resource
    EmailMapper emailMapper;

    public List<Email> getEmail(EmailExample emailExample) {
        return emailMapper.selectByExample(emailExample);
    }

    public int insertEmail(Email email) {
        return emailMapper.insert(email);
    }

    public int deleteEmail(String id) {
        return emailMapper.deleteByPrimaryKey(id);
    }
}
