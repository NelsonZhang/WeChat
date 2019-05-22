package com.zt.wechat.controller;

import com.zt.wechat.Message;
import com.zt.wechat.Picture_User;
import com.zt.wechat.model.Picture;
import com.zt.wechat.model.PictureExample;
import com.zt.wechat.service.PictureService;
import com.zt.wechat.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureController {
    @Resource
    PictureService pictureService;

    @Resource
    UserService userService;

    private Message message;

    @RequestMapping(value = "/getPictureByPictureID", method = RequestMethod.POST)
    public Message getPictureByID(String id) {
        message = new Message();
        try {
            Picture picture = pictureService.getPicture(id);

            if (picture != null) {

                synchronized (PictureController.class) {
                    pictureService.updateReadingNum(picture.getId());
                }

                message.setCode("1");
                message.setMessage("success");
                message.setData(picture);
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }

    @RequestMapping(value = "/getPictureByUserID", method = RequestMethod.POST)
    public Message getPictureByUserID(String id) {
        message = new Message();
        try {
            PictureExample pictureExample = new PictureExample();
            PictureExample.Criteria criteria = pictureExample.createCriteria();
            criteria.andUserEqualTo(id);
            List<Picture> list = pictureService.getPicture(pictureExample);
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

    @RequestMapping(value = "/deletePicture", method = RequestMethod.POST)
    public Message deletePicture(String id) {
        message = new Message();
        try {
            if (pictureService.deletePicture(id) == 1) {
                message.setCode("1");
                message.setMessage("success");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }

        return message;
    }

    @RequestMapping(value = "/updateUpNum", method = RequestMethod.POST)
    public synchronized Message updateUpNum(String id) {
        message = new Message();
        try {
            if (pictureService.updateUpNum(id) == 1) {
                message.setCode("1");
                message.setMessage("success");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }

        return message;
    }

    @RequestMapping(value = "/getHotPicture", method = RequestMethod.GET)
    public Message getHotPicture() {
        message = new Message();
        try {
            PictureExample pictureExample = new PictureExample();
            PictureExample.Criteria criteria = pictureExample.createCriteria();
            criteria.andUpnumGreaterThanOrEqualTo(0);
            List<Picture> list = pictureService.getPicture(pictureExample);
            if (!list.isEmpty()) {

                list.sort(Picture::compareTo);//根据点赞数进行排序。
                if (list.size() > 10) {
                    list = list.subList(0, 10);
                }

                List<Picture_User> temp = new ArrayList<>();//将图片与对应的用户进行关联。
                Picture_User pictureUser;
                for (int i = 0; i < list.size(); i++) {
                    Picture picture = list.get(i);
                    pictureUser = new Picture_User();
                    pictureUser.setPicture(picture);
                    pictureUser.setUser(userService.getUser(picture.getUser()));
                    synchronized (PictureController.class) {
                        pictureService.updateReadingNum(picture.getId());
                    }
                    temp.add(pictureUser);
                }

                message.setCode("1");
                message.setMessage("success");
                message.setData(temp);
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }

        return message;
    }
}
