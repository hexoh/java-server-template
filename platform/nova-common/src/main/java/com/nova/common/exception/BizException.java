package com.nova.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * 业务异常
 * 用于业务逻辑中主动抛出的可预期异常。
 * 不依赖 Spring、Servlet 等框架。
 */
@Getter
@Setter
public class BizException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_ERR_CODE = "BIZ_ERROR";

    /**
     * 构造业务异常
     * @param message 异常信息
     */
    public BizException(String message) {
        super(DEFAULT_ERR_CODE, message);
    }

    /**
     * 构造业务异常
     * @param message 异常信息
     * @param cause 原始异常
     */
    public BizException(String message, Throwable cause) {
        super(DEFAULT_ERR_CODE, message, cause);
    }

    /**
     * 构造业务异常
     *
     * @param code    错误码
     * @param message 异常信息
     */
    public BizException(String code, String message) {
        super(code, message);
    }

    /**
     * 构造业务异常（包含原始异常）
     *
     * @param code    错误码
     * @param message 异常信息
     * @param cause   原始异常
     */
    public BizException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
