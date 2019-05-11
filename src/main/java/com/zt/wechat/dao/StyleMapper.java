package com.zt.wechat.dao;

import com.zt.wechat.model.Style;
import com.zt.wechat.model.StyleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StyleMapper {
    long countByExample(StyleExample example);

    int deleteByExample(StyleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Style record);

    int insertSelective(Style record);

    List<Style> selectByExample(StyleExample example);

    Style selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Style record, @Param("example") StyleExample example);

    int updateByExample(@Param("record") Style record, @Param("example") StyleExample example);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}