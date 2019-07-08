package com.qfedu.cloud_helloconsumer.vo;

import lombok.Data;

/**
 *@Author feri
 *@Date Created in 2019/7/8 15:45
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R setOK(String msg,Object obj){
        R r=new R();
        r.setCode(200);
        r.setData(obj);
        r.setMsg(msg);
        return r;
    }
    public static R setERROR(String msg,Object obj){
        R r=new R();
        r.setCode(400);
        r.setData(obj);
        r.setMsg(msg);
        return r;
    }

}
