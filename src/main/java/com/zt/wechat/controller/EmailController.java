package com.zt.wechat.controller;

import com.zt.wechat.Information;
import com.zt.wechat.Message;
import com.zt.wechat.model.Email;
import com.zt.wechat.model.EmailExample;
import com.zt.wechat.service.EmailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Resource
    EmailService emailService;

    private Message message;

    @RequestMapping(value = "/getEmail", method = RequestMethod.GET)
    public Message getEmail(String id) {
        message = new Message();
        try {
            EmailExample emailExample = new EmailExample();
            EmailExample.Criteria criteria = emailExample.createCriteria();
            criteria.andUserEqualTo(id);
            List<Email> list = emailService.getEmail(emailExample);
            if (!list.isEmpty()) {
                message.setCode("1");
                message.setMessage("success");
                message.setData(list);
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }

        return message;
    }

    @RequestMapping(value = "/deleteEmail", method = RequestMethod.GET)
    public Message deleteEmail(String id) {
        message = new Message();
        try {
            if (emailService.deleteEmail(id) == 1) {
                message.setCode("1");
                message.setMessage("success");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }

    @RequestMapping(value = "/insertEmail", method = RequestMethod.POST)
    public Message insertEmail(Email email, MultipartFile file) {
        message = new Message();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date;
            synchronized (EmailController.class) {
                date = new Date();
            }
            String time = format.format(date);
            email.setId(time);
            email.setTime(date);

            if (file != null) {
                String imageName = file.getOriginalFilename();
                imageName = time + "." + imageName.substring(imageName.lastIndexOf(".") + 1);

                File dir = new File(Information.PATH + "Email/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File fil = new File(dir, imageName);
                file.transferTo(fil);
                String url = Information.URL + "Email/" + imageName;
                email.setUrl(url);
            }

            if (emailService.insertEmail(email) == 1) {
                message.setCode("1");
                message.setMessage("success");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }
}
