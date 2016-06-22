package com.shang.spary.common.base;

import com.alibaba.fastjson.JSON;


public class BaseApiResult {

    public static enum ApiResultCode {
        SUC, FAIL
    }

    /**
     * 0:成功
     * 1:失败
     */
    private int code;
    private String message;

    public BaseApiResult(String message) {
        this.message = message;
    }

    public BaseApiResult() {
    }

    protected BaseApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    protected BaseApiResult(ApiResultCode code, String message) {
        this.code = code.ordinal();
        this.message = message;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public BaseApiResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static BaseApiResult getOK(String key) {
        return getBaseApiResult(key, 0);
    }

    public static BaseApiResult getERROR(String key) {
        return getBaseApiResult(key, 1);
    }

    private static BaseApiResult getBaseApiResult(String key, int code) {
        return null;
    }

    public static BaseApiResult getError(String message) {
        return null;
    }
}
