package com.zt.wechat.controller;

import com.zt.wechat.Message;
import com.zt.wechat.model.Email;
import com.zt.wechat.model.EmailExample;
import com.zt.wechat.service.EmailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Resource
    EmailService emailService;

    private Message message;

    @RequestMapping(value = "/getEmail", method = RequestMethod.POST)
    public Message getEmail(String phoneNumber) {
        EmailExample emailExample = new EmailExample();
        EmailExample.Criteria criteria = emailExample.createCriteria();
        criteria.andSenderNumberEqualTo(phoneNumber);
        List<Email> list = emailService.getEmail(emailExample);
        message = new Message();
        if (list != null) {
            message.setCode("1");
            message.setMessage("success");
            message.setData(list);
        }
        return message;
    }

    @RequestMapping(value = "/deleteEmail", method = RequestMethod.POST)
    public Message deleteEmail(String id) {
        message = new Message();
        if (emailService.deleteEmail(id) == 1) {
            message.setCode("1");
            message.setMessage("success");
        }
        return message;
    }

    @RequestMapping(value = "/insertEmail", method = RequestMethod.POST)
    public Message insertEmail(Email email) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String time = format.format(date);
        email.setId(time);
        message = new Message();
        if (emailService.insertEmail(email) == 1) {
            message.setCode("1");
            message.setMessage("success");
        }
        return message;
    }
}
