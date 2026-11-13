package com.nova.common.exception;

import java.io.Serial;

/**
 * System Exception is unexpected Exception, retry might work again
 *
 * @author Allen He
 */
public class SystemException extends BaseException {
    @Serial
    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_ERR_CODE = "SYS_ERROR";

    public SystemException(String errMessage) {
        super(DEFAULT_ERR_CODE, errMessage);
    }

    public SystemException(String errCode, String errMessage) {
        super(errCode, errMessage);
    }

    public SystemException(String errMessage, Throwable e) {
        super(DEFAULT_ERR_CODE, errMessage, e);
    }

    public SystemException(String errorCode, String errMessage, Throwable e) {
        super(errorCode, errMessage, e);
    }
}
