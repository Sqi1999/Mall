package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyCategory;
import com.macro.mall.tiny.mbg.model.TallyCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyCategoryMapper {
    long countByExample(TallyCategoryExample example);

    int deleteByExample(TallyCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TallyCategory record);

    int insertSelective(TallyCategory record);

    List<TallyCategory> selectByExample(TallyCategoryExample example);

    TallyCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TallyCategory record, @Param("example") TallyCategoryExample example);

    int updateByExample(@Param("record") TallyCategory record, @Param("example") TallyCategoryExample example);

    int updateByPrimaryKeySelective(TallyCategory record);

    int updateByPrimaryKey(TallyCategory record);
}