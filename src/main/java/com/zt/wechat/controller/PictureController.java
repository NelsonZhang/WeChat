package com.zt.wechat.controller;

import com.zt.wechat.Message;
import com.zt.wechat.model.Picture;
import com.zt.wechat.model.PictureExample;
import com.zt.wechat.service.PictureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureController {
    @Resource
    PictureService pictureService;

    private Message message;

    @RequestMapping(value = "/getPictureByID", method = RequestMethod.POST)
    public Message getPictureByID(String id) {
        Picture picture = pictureService.getPicture(id);
        message = new Message();
        if (picture != null) {
            message.setCode("1");
            message.setMessage("success");
            message.setData(picture);
        }
        return message;
    }

    @RequestMapping(value = "/getPictureByPhoneNumber", method = RequestMethod.POST)
    public Message getPictureByPhoneNumber(String phoneNumber) {
        PictureExample pictureExample = new PictureExample();
        PictureExample.Criteria criteria = pictureExample.createCriteria();
        criteria.andPhoneNumberEqualTo(phoneNumber);
        List<Picture> list = pictureService.getPicture(pictureExample);
        message = new Message();
        if (list != null) {
            message.setCode("1");
            message.setMessage("success");
            message.setData(list);
        }
        return message;
    }

    @RequestMapping(value = "/deletePicture", method = RequestMethod.POST)
    public Message deletePicture(String id) {
        message = new Message();
        if (pictureService.deletePicture(id) == 1) {
            message.setCode("1");
            message.setMessage("success");
        }
        return message;
    }

    @RequestMapping(value = "/insertPicture", method = RequestMethod.POST)
    public Message insertPicture(Picture picture) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String time = format.format(date);
        picture.setId(time);
        picture.setTime(time);
        picture.setUrl("1234");
        message = new Message();
        if (pictureService.insertPicture(picture) == 1) {
            message.setCode("1");
            message.setMessage("success");
        }
        return message;
    }
}
