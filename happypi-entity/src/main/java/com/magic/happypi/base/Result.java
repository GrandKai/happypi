package com.magic.happypi.base;

import java.util.HashMap;

/**
 * Created by zhangyn on 17-7-12.
 * 返回结果集统一格式：new Result() --> 默认 0 成功
 *
 */
public class Result extends HashMap<String, Object> {

    /**
     * 默认请求成功
     */
    public Result() {
        setCode(0);
    }

    /**
     * 默认请求成功消息
     * @param message
     */
    public Result(String message) {
        setCode(0);
        setMessage(message);
    }
    public Result(Object content) {
        setCode(0);
        setContent(content);
    }

    /**
     * @param code
     */
    public Result setCode(Integer code) {
        this.put("code", code);
        return this;
    }

    public Result setContent(Object content) {
        this.put("content", content);
        return this;
    }

    public Result setMessage(String message) {
        if (!(message == null || message.length() == 0)) {
            this.put("message", message);
        }
        return this;
    }

    /**
     * 设置返回代码，返回消息,返回结果
     * @param code
     * @param message
     * @param content
     */
    public Result setResult(int code, String message, Object content) {
        this.put("code", code);
        this.put("message", message);
        this.put("content", content);
        return this;
    }

    /**
     * 设置返回代码，返回消息
     * @param code
     * @param message
     */
    public Result setCodeMessage(int code, String message) {
        this.put("code", code);
        this.put("message", message);
        return this;
    }

    /**
     * 设置成功消息，默认成功代码 0
     * @param message
     */
    public Result setMessageSuccess(String message) {
        this.put("code", 0);
        this.put("message", message);
        return this;
    }

    /**
     * 设置失败消息，默认失败代码 -1
     * @param message
     */
    public Result setMessageError(String message) {
        this.put("code", -1);
        this.put("message", message);
        return this;
    }

    public Result set(String key, Object value) {
        this.put(key, value);
        return this;
    }

    public Object get(String key) {
        return this.get(key) != null ? this.get(key) : null;
    }
}
