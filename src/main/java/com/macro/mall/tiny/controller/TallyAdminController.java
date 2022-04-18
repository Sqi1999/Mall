package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.mbg.model.TallyUser;
import com.macro.mall.tiny.service.TallyAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/4/18 16:26
 */
@Api(  tags = "TallyAdminController" )
@Controller
@RequestMapping("/brand")
public class TallyAdminController {

    @Autowired
    private  TallyAdminService tallyAdminService;

    @PostMapping("/userInstall")
    public int userInstall(@RequestBody  TallyUser tallyUser){
        return tallyAdminService.tallyinstall(tallyUser);

    }
}
