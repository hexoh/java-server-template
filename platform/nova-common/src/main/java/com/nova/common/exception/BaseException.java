package com.nova.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * Base Exception is the parent of all exceptions
 *
 * @author Allen He
 */
@Setter
@Getter
public abstract class BaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    private String errCode;

    public BaseException(String errMessage) {
        super(errMessage);
    }

    public BaseException(String errCode, String errMessage) {
        super(errMessage);
        this.errCode = errCode;
    }

    public BaseException(String errMessage, Throwable cause) {
        super(errMessage, cause);
    }

    public BaseException(String errCode, String errMessage, Throwable cause) {
        super(errMessage, cause);
        this.errCode = errCode;
    }

}
