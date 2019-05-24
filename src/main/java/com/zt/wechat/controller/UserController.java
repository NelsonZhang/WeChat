package com.zt.wechat.controller;

import com.zt.wechat.Message;
import com.zt.wechat.model.User;
import com.zt.wechat.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Message login(String code, String name, String url) {
        Message message = new Message();
        try {
            String result = userService.getOpenidAndSessionKey(code);
            JSONObject jsonObject = JSONObject.fromObject(result);
            String openid = (String) jsonObject.get("openid");
            User user = userService.getUser(openid);
            if (user == null) {
                user = new User();
                user.setId(openid);
                user.setAvatar(url);
                user.setName(name);
                if (userService.register(user) == 1) {
                    message.setCode("1");
                    message.setMessage("success");
                    message.setData(user);
                }
            } else {
                message.setCode("1");
                message.setMessage("success");
                message.setData(user);
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    private String get() {
        return "nihao";
    }
}
