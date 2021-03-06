package com.scxd.lawqinghai.bean.response;

import java.util.List;

/**
 * 描述：设备布控
 * 公司：四川星盾科技股份有限公司
 * 编写人：陈渝金-pc:64550
 * 时间： 2018/6/13
 * 修改人：
 * 修改时间：
 */


public class BaseDispatchResponseJson {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private Meta meta;     // 元数据
    private DispatchResp data;   // 响应内容

    public BaseDispatchResponseJson success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    public BaseDispatchResponseJson success(DispatchResp data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public BaseDispatchResponseJson failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public BaseDispatchResponseJson failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public DispatchResp getData() {
        return data;
    }

    /**
     * 请求元数据
     */
    public class Meta {

        private boolean success;
        private String message;

        public Meta(boolean success) {
            this.success = success;
        }

        public Meta(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }

}
