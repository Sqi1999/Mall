package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyKind;
import com.macro.mall.tiny.mbg.model.TallyKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyKindMapper {
    long countByExample(TallyKindExample example);

    int deleteByExample(TallyKindExample example);

    int deleteByPrimaryKey(Integer kindId);

    int insert(TallyKind record);

    int insertSelective(TallyKind record);

    List<TallyKind> selectByExample(TallyKindExample example);

    TallyKind selectByPrimaryKey(Integer kindId);

    int updateByExampleSelective(@Param("record") TallyKind record, @Param("example") TallyKindExample example);

    int updateByExample(@Param("record") TallyKind record, @Param("example") TallyKindExample example);

    int updateByPrimaryKeySelective(TallyKind record);

    int updateByPrimaryKey(TallyKind record);
}