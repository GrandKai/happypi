package com.magic.happypi.utils;

import com.magic.happypi.exception.BusinessException;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by zhangyn on 17-8-1.
 */
public class PatternUtils {
    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^1[3|4|5|7|8][0-9]{9}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^(\\w)+(\\.\\w+)*@([\\w\\-])+((\\.\\w+)+)$";
    /**
     * 是否带有小数decimal(12,2)
     */
//    public static final String REGEX_DECIMAL = "^[0-9]\\d{0,13}(\\.\\d{0,2})?$";
    public static final String REGEX_DECIMAL = "^-?[0-9]\\d{0,13}(\\.\\d{0,2})?$";

    /**
     * [0, 1] 之间的4位小数
     */
    public static final String REGEX_PERCENT = "^0(\\.[0-9]{0,4})?$|^1(\\.[0]{0,4})?$";

    /***
     * 部门名称验证
     *
     * @param value
     */
    public static final String IS_NAME = "^[\\u4E00-\\u9FFF]+$";
    /**
     * 时间验证的正则表达式，yyyy-MM-dd
     */
    public static final String REGEX_DATE = "^((((19|20)\\d{2})-(0?(1|[3-9])|1[012])-(0?[1-9]|[12]\\d|30))|(((19|20)\\d{2})-(0?[13578]|1[02])-31)|(((19|20)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))-0?2-29))|((((19|20)\\d{2})/(0?(1|[3-9])|1[012])/(0?[1-9]|[12]\\d|30))|(((19|20)\\d{2})/(0?[13578]|1[02])/31)|(((19|20)\\d{2})/0?2/(0?[1-9]|1\\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))/0?2/29))$";

    /**
     * 正整数验证，比如员工编号
     */
    public static final String REGEX_INTEGER = "^[1-9][0-9]{0,9}$";


    public static void isEmpty(String value, String title) {
        if (StringUtils.isEmpty(value)) {
            throw new BusinessException(title + "不能为空");
        }
    }


    public static void isRightString(String value) {
        if (!Pattern.matches(IS_NAME, value)) {
            throw new BusinessException(value + "录入不正确");
        }
    }

    public static void isMobile(String value) {
        if (!Pattern.matches(REGEX_MOBILE, value)) {
            throw new BusinessException(value + "不是有效手机号码");
        }
    }

    public static void isEmail(String value) {
        if (!Pattern.matches(REGEX_EMAIL, value)) {
            throw new BusinessException(value + "不是有效邮箱");
        }
    }

    public static void isDecimal(String value) {
        if (!Pattern.matches(REGEX_DECIMAL, value)) {
            throw new BusinessException(value + "不是有效数字");
        }
    }

    public static void isPercent(String value) {
        if (!Pattern.matches(REGEX_PERCENT, value)) {
            throw new BusinessException(value + "不是有效百分数");
        }
    }

    public static void isDate(String value) {
        if (!Pattern.matches(REGEX_DATE, value)) {
            throw new BusinessException(value + "不符合yyyy-MM-dd的时间格式");
        }
    }

    public static void isInteger(String value) {
        if (!Pattern.matches(REGEX_INTEGER, value)) {
            throw new BusinessException(value + "不符合整数的格式");
        }
    }


    public static void main(String[] args) {
//        System.out.println(Pattern.matches(REGEX_EMAIL, "yy@winstock.com.cn.com.cn"));
//        System.out.println(Pattern.matches(REGEX_DECIMAL, "1"));
//        System.out.println(Pattern.matches(REGEX_INTEGER, "20001"));
        System.out.println(Pattern.matches(REGEX_DECIMAL, "0.5"));


    }
}
