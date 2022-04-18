package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.TallyFriend;
import com.macro.mall.tiny.mbg.model.TallyFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyFriendMapper {
    long countByExample(TallyFriendExample example);

    int deleteByExample(TallyFriendExample example);

    int deleteByPrimaryKey(String friendId);

    int insert(TallyFriend record);

    int insertSelective(TallyFriend record);

    List<TallyFriend> selectByExample(TallyFriendExample example);

    TallyFriend selectByPrimaryKey(String friendId);

    int updateByExampleSelective(@Param("record") TallyFriend record, @Param("example") TallyFriendExample example);

    int updateByExample(@Param("record") TallyFriend record, @Param("example") TallyFriendExample example);

    int updateByPrimaryKeySelective(TallyFriend record);

    int updateByPrimaryKey(TallyFriend record);
}