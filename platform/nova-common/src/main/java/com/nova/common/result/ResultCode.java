package com.nova.common.result;

import com.nova.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public enum ResultCode implements ErrorCode {
    SUCCESS("0", "成功"),
    PARAM_ERROR("PARAM_ERROR", "参数校验失败"),
    UNAUTHORIZED("UNAUTHORIZED", "未登录或token失效"),
    FORBIDDEN("FORBIDDEN", "权限不足"),
    NOT_FOUND("NOT_FOUND", "请求资源不存在"),
    SERVER_ERROR("SERVER_ERROR", "服务器内部异常"),
    // 业务自定义错误码
    USER_NOT_EXIST("USER_NOT_EXIST", "用户不存在"),
    USER_PASSWORD_ERROR("USER_PASSWORD_ERROR", "密码错误"),
    REPEAT_SUBMIT("REPEAT_SUBMIT", "请勿重复提交");

    private final String code;
    private final String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}

