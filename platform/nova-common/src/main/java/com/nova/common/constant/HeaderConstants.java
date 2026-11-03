package com.nova.common.constant;

/**
 * Http header constants
 */
public class HeaderConstants {

    private HeaderConstants() {
        // 工具类，禁止实例化
    }

    // ==================== 标准 HTTP 头 ====================
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String ACCEPT = "Accept";
    public static final String AUTHORIZATION = "Authorization";
    public static final String USER_AGENT = "User-Agent";

    // ==================== 自定义业务头 ====================
    public static final String X_TRACE_ID = "X-Trace-Id";
    public static final String X_USER_ID = "X-User-Id";
    public static final String X_TENANT_ID = "X-Tenant-Id";

    // ==================== 常用值 ====================
    public static final String JSON_UTF8 = "application/json;charset=UTF-8";
    public static final String FORM_URLENCODED = "application/x-www-form-urlencoded";
}
