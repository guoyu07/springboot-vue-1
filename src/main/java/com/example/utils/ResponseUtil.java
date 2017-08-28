package com.example.utils;

/**
 * 响应结果工具类
 * @author jiangchong
 * @since 2017/8/23 20:52
 */
public class ResponseUtil {

    public static Object success(Integer code, String msg, Object data) {
        return new Response(code, msg, data);
    }

    public static Object success(Object data) {
        return success(200, "请求成功!", data);
    }

    public static Object success() {
        return success(200, "请求成功!", null);
    }

    public static Object error() {
        return error(500, "服务器错误!");
    }

    public static Object error(Integer code, String msg) {
        return new Response(code, msg);
    }
}
