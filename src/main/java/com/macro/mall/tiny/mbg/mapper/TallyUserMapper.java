package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyUser;
import com.macro.mall.tiny.mbg.model.TallyUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TallyUserMapper {
    long countByExample(TallyUserExample example);

    int deleteByExample(TallyUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TallyUser record);

    int insertSelective(TallyUser record);

    List<TallyUser> selectByExample(TallyUserExample example);

    TallyUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TallyUser record, @Param("example") TallyUserExample example);

    int updateByExample(@Param("record") TallyUser record, @Param("example") TallyUserExample example);

    int updateByPrimaryKeySelective(TallyUser record);

    int updateByPrimaryKey(TallyUser record);
}