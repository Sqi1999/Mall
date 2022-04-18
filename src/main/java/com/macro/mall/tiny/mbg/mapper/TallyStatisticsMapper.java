package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyStatistics;
import com.macro.mall.tiny.mbg.model.TallyStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyStatisticsMapper {
    long countByExample(TallyStatisticsExample example);

    int deleteByExample(TallyStatisticsExample example);

    int deleteByPrimaryKey(Integer statisticsId);

    int insert(TallyStatistics record);

    int insertSelective(TallyStatistics record);

    List<TallyStatistics> selectByExample(TallyStatisticsExample example);

    TallyStatistics selectByPrimaryKey(Integer statisticsId);

    int updateByExampleSelective(@Param("record") TallyStatistics record, @Param("example") TallyStatisticsExample example);

    int updateByExample(@Param("record") TallyStatistics record, @Param("example") TallyStatisticsExample example);

    int updateByPrimaryKeySelective(TallyStatistics record);

    int updateByPrimaryKey(TallyStatistics record);
}