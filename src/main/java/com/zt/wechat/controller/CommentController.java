package com.zt.wechat.controller;

import com.zt.wechat.Comment_User;
import com.zt.wechat.Message;
import com.zt.wechat.model.Comment;
import com.zt.wechat.model.CommentExample;
import com.zt.wechat.service.CommentService;
import com.zt.wechat.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    @Resource
    UserService userService;

    private Message message;

    @RequestMapping(value = "/getComment", method = RequestMethod.POST)
    public Message getComment(String id) {
        message = new Message();
        try {
            CommentExample commentExample = new CommentExample();
            CommentExample.Criteria criteria = commentExample.createCriteria();
            criteria.andPictureEqualTo(id);
            List<Comment> list = commentService.getComment(commentExample);
            if (!list.isEmpty()) {
                List<Comment_User> temp = new ArrayList<>();
                Comment_User commentUser;
                for (int i = 0; i < list.size(); i++) {
                    commentUser = new Comment_User();
                    commentUser.setComment(list.get(i));
                    commentUser.setUser(userService.getUser(list.get(i).getUser()));
                    temp.add(commentUser);
                }
                message.setData(temp);
                message.setMessage("success");
                message.setCode("1");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }

    @RequestMapping(value = "insertComment", method = RequestMethod.POST)
    public Message insertComment(Comment comment, MultipartFile file) {
        message = new Message();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date;
            synchronized (CommentController.class) {
                date = new Date();
            }
            String time = format.format(date);

            if (file != null) {
                String imageName = file.getOriginalFilename();
                imageName = time + "." + imageName.substring(imageName.lastIndexOf(".") + 1);

                File dir = new File("/var/www/html/zt/Comment/" + comment.getPicture() + "/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File fil = new File(dir, imageName);
                file.transferTo(fil);
                String url = "https://120.77.178.170/zt/Comment/" + comment.getPicture() + "/" + imageName;
                comment.setUrl(url);
            }

            comment.setId(time);
            comment.setTime(date);

            if (commentService.insertComment(comment) == 1) {
                message.setMessage("success");
                message.setCode("1");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }
        return message;
    }
}
