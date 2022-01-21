package com.macro.mall.tiny.common.api;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 14:20
 */
public enum  ResultCode implements  IErrorCode {
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(404,"参数校验失败"),
    UNAUTHORIZED(403,"暂时没有登录或者Token已经过期"),
    FORBIDDEN(403,"没有权限");

    private long code;
    private String message;

private ResultCode(long code,String messges){
    this.code=code;
    this.message=messges;
}

    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
