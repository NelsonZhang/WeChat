package com.zt.wechat.service;

import com.zt.wechat.dao.PictureMapper;
import com.zt.wechat.model.Picture;
import com.zt.wechat.model.PictureExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PictureService {
    @Resource
    PictureMapper pictureMapper;

    public Picture getPicture(String id) {
        return pictureMapper.selectByPrimaryKey(id);
    }

    public int deletePicture(String id) {
        return pictureMapper.deleteByPrimaryKey(id);
    }

    public int insertPicture(Picture picture) {
        return pictureMapper.insert(picture);
    }

    public List<Picture> getPicture(PictureExample pictureExample) {
        return pictureMapper.selectByExample(pictureExample);
    }
}
