package com.shang.spray.common.base;

import java.util.HashMap;
import java.util.Map;

public class BaseApiResult{

    private int code;
    private String msg;

    /**
     * 成功返回结果
     */
    public static BaseApiResult successResult() {
        BaseApiResult baseApiResult=new BaseApiResult();
        baseApiResult.setCode(BaseApiCode.SUCCESS.getCode());
        baseApiResult.setMsg(BaseApiCode.SUCCESS.getMsg());
        return baseApiResult;
    }

    /**
     * 失败返回结果
     */
    public static BaseApiResult failResult() {
        BaseApiResult baseApiResult=new BaseApiResult();
        baseApiResult.setCode(BaseApiCode.FAIL.getCode());
        baseApiResult.setMsg(BaseApiCode.FAIL.getMsg());
        return baseApiResult;
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
