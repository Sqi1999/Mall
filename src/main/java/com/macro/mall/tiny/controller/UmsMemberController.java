package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/2/18 14:53
 */
@Controller
@Api("会员登录管理系统")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value="/getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(String telephone){
        return umsMemberService.generateAutCode(telephone);
    }
    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode" ,method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam  String telephone,
                                       @RequestParam String authCode){
        return umsMemberService.verifyAuthCode(telephone, authCode);
    }
}
