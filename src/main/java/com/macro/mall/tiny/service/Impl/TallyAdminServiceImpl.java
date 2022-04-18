package com.macro.mall.tiny.service.Impl;

import com.macro.mall.tiny.mbg.mapper.TallyUserMapper;
import com.macro.mall.tiny.mbg.model.TallyAccountpassword;
import com.macro.mall.tiny.mbg.model.TallyUser;
import com.macro.mall.tiny.service.TallyAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/4/18 16:30
 */
@Service
public class TallyAdminServiceImpl implements TallyAdminService {
    @Autowired
    private TallyUserMapper TallyUserMapper;

    @Autowired
    private TallyAccountpassword TallyAccountpassword;

    @Override
    public int tallyinstall(TallyUser tallyUser) {

        tallyUserMapper.selectByPrimaryKey(tallyUser.getUserId());
        return tallyUserMapper.insert(tallyUser);



    }
}
