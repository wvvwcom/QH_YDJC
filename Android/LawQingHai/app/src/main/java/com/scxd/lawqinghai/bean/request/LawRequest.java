package com.scxd.lawqinghai.bean.request;

/**
 * @类名: ${type_name}
 * @功能描述:
 * @作者: ${user}
 * @时间: ${date}
 * @最后修改者:
 * @最后修改内容:
 */
public class LawRequest {
    
    private String name;
    private int page;
    private int pageSize;

    public LawRequest(String name, int page, int pageSize) {
        this.name = name;
        this.page = page;
        this.pageSize = pageSize;
    }
}
