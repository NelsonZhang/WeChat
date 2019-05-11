package com.zt.wechat.controller;

import com.zt.wechat.Message;
import com.zt.wechat.model.Style;
import com.zt.wechat.model.StyleExample;
import com.zt.wechat.service.StyleService;
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
@RequestMapping("/style")
public class StyleController {
    @Resource
    StyleService styleService;

    private Message message;

    @RequestMapping(value = "/getStyle", method = RequestMethod.POST)
    public Message getStyle(String address) {
        StyleExample styleExample = new StyleExample();
        StyleExample.Criteria criteria = styleExample.createCriteria();
        criteria.andAddressEqualTo(address);
        List<Style> list = styleService.getStyle(styleExample);
        message = new Message();
        if (list != null) {
            message.setCode("1");
            message.setMessage("success");
            message.setData(list);
        }
        return message;
    }

    @RequestMapping(value = "/insertStyle", method = RequestMethod.POST)
    public Message insertStyle(Style style, MultipartFile file) throws Exception {
        message = new Message();

        if (file == null) {
            return message;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String time = format.format(date);

        String imageName = file.getOriginalFilename();
        imageName = time + "." + imageName.substring(imageName.lastIndexOf(".") + 1);
        String path = style.getAddress() + "/";
        File dir = new File("/www/wwwroot/120.79.15.71/Style/" + path);
//        File dir = new File("D:/JavaProgram/wechat/Style/" + path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File fil = new File(dir, imageName);
        file.transferTo(fil);
        String url = "http://120.79.15.71/Style/" + path + imageName;

        style.setId(time);
        style.setUrl(url);

        if (styleService.insertStyle(style) == 1 && fil.exists()) {
            message.setCode("1");
            message.setMessage("success");
        }
        return message;
    }
}
