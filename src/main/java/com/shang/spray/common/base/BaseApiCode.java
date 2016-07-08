package com.shang.spray.common.base;

/**
 * info:
 * Created by shang on 16/6/23.
 */
public enum BaseApiCode {

    SUCCESS(200,"SUCCESS"),
    FAIL(500,"FAIL");

    private int code;
    private String msg;

    BaseApiCode(int cede,String msg) {
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
