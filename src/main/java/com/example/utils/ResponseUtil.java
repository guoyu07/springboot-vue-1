package com.example.utils;

/**
 * 响应结果工具类
 * @author jiangchong
 * @since 2017/8/23 20:52
 */
public class ResponseUtil {

    public static Response success(Integer code, String msg, Object data) {
        return new Response(code, msg, data);
    }

    public static Response success(Object data) {
        return success(200, "请求成功!", data);
    }

    public static Response success() {
        return success(200, "请求成功!", null);
    }

    public static Response error() {
        return error(500, "服务器错误!");
    }

    public static Response error(Integer code, String msg) {
        return new Response(code, msg);
    }
}
