package com.zt.wechat.service;

import com.zt.wechat.dao.CommentMapper;
import com.zt.wechat.model.Comment;
import com.zt.wechat.model.CommentExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentService {
    @Resource
    CommentMapper commentMapper;

    public List<Comment> getComment(CommentExample commentExample) {
        return commentMapper.selectByExample(commentExample);
    }

    public int insertComment(Comment comment) {
        return commentMapper.insert(comment);
    }
}
