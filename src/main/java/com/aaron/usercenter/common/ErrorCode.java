package com.aaron.usercenter.common;

/**
 * 错误码
 *
 * @author yupi
 */

public enum ErrorCode {
    SUCCESS(0, "Success", ""),
    PARAMS_ERROR(40000, "Wrong request parameters", ""),
    NULL_ERROR(40001, "Null request data", ""),
    NOT_LOGIN(40100, "Not logged in", ""),
    NO_AUTH(40101, "No authority", ""),
    SYSTEM_ERROR(50000, "System internal error", "");

    private final int code;

    /**
     * State code info
     */
    private final String message;

    /**
     * State code description (detailed)
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
