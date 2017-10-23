package com.magic.happypi.utils;

public class NumberUtils {

    /**
     * 数值转换， 默认值：0
     *
     * @param obj
     * @param defaultValue
     * @param <T>
     * @return
     */
    public static <T> T toNumber(T obj, Object defaultValue) {
        if (obj == null || "".equals(obj))
            return (T) defaultValue;
        return obj;
    }

    /**
     * 数值转换， 默认值：0
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> T toNumber(T obj) {
        return toNumber(obj, 0);
    }

    public static <T> T toDouble(T obj) {
        return toNumber(obj, 0d);
    }
}
