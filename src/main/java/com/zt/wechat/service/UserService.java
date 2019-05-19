package com.zt.wechat.service;

import com.zt.wechat.Information;
import com.zt.wechat.dao.UserMapper;
import com.zt.wechat.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public int register(User user) {
        return userMapper.insert(user);
    }

    public User getUser(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public String getOpenidAndSessionKey(String code) throws Exception {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = "https://api.weixin.qq.com/sns/jscode2session?appid="
                    + Information.APPID + "&secret="
                    + Information.SCRECT + "&js_code="
                    + code + "&grant_type=authorization_code";

            URL url = new URL(urlNameString);
            URLConnection connection = url.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            throw e;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return result;
    }

}
