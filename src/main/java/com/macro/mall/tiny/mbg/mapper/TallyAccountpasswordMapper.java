package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyAccountpassword;
import com.macro.mall.tiny.mbg.model.TallyAccountpasswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyAccountpasswordMapper {
    long countByExample(TallyAccountpasswordExample example);

    int deleteByExample(TallyAccountpasswordExample example);

    int insert(TallyAccountpassword record);

    int insertSelective(TallyAccountpassword record);

    List<TallyAccountpassword> selectByExample(TallyAccountpasswordExample example);

    int updateByExampleSelective(@Param("record") TallyAccountpassword record, @Param("example") TallyAccountpasswordExample example);

    int updateByExample(@Param("record") TallyAccountpassword record, @Param("example") TallyAccountpasswordExample example);
}