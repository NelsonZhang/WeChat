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
    public Message getStyle(String province, String city) {
        message = new Message();
        try {
            StyleExample styleExample = new StyleExample();
            StyleExample.Criteria criteria = styleExample.createCriteria();
            criteria.andProvinceEqualTo(province);
            criteria.andCityEqualTo(city);
            List<Style> list = styleService.getStyle(styleExample);

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

    @RequestMapping(value = "/insertStyle", method = RequestMethod.POST)
    public Message insertStyle(Style style, MultipartFile file) {
        message = new Message();
        try {
            if (file == null) {
                return message;
            }

            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date;
            synchronized (StyleController.class) {
                date = new Date();
            }
            String time = format.format(date);

            String imageName = file.getOriginalFilename();
            imageName = time + "." + imageName.substring(imageName.lastIndexOf(".") + 1);
            String path = style.getProvince() + "/" + style.getCity() + "/";
            File dir = new File("/var/www/html/zt/Style/" + path);
//        File dir = new File("D:/JavaProgram/wechat/Style/" + path);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File fil = new File(dir, imageName);
            file.transferTo(fil);
            String url = "https://120.77.178.170/zt/Style/" + path + imageName;

            style.setId(time);
            style.setUrl(url);

            if (styleService.insertStyle(style) == 1 && fil.exists()) {
                message.setCode("1");
                message.setMessage("success");
            }
        } catch (Exception e) {
            message.setMessage(e.getMessage());
        }

        return message;
    }
}
