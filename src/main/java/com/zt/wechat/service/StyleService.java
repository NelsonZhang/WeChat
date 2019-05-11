package com.zt.wechat.service;

import com.zt.wechat.dao.StyleMapper;
import com.zt.wechat.model.Style;
import com.zt.wechat.model.StyleExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StyleService {
    @Resource
    StyleMapper styleMapper;

    public List<Style> getStyle(StyleExample styleExample) {
        return styleMapper.selectByExample(styleExample);
    }

    public int insertStyle(Style style) {
        return styleMapper.insert(style);
    }
}
