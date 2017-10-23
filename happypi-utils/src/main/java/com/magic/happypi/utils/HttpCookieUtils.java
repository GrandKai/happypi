package com.magic.happypi.utils;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * HttpCookie工具类
 * 
 * @author sxc
 *
 */
public class HttpCookieUtils {
    private HttpCookieUtils() {
    }

    public static Map<String, Object> getCookieValues(HttpServletRequest httpServletRequest) {
        if(null == httpServletRequest) {
            throw new IllegalArgumentException("参数错误");
        } else {
            HashMap<String, Object> cookieMap = new HashMap<String, Object>();
            Cookie[] cookies = httpServletRequest.getCookies();
            if(ArrayUtils.isNotEmpty(cookies)) {
                Cookie[] var3 = cookies;
                int var4 = cookies.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    Cookie cookie = var3[var5];

                    try {
                        String e = cookie.getName();
                        String value = new String(Base64.decodeBase64(cookie.getValue()), "UTF-8");
                        cookieMap.put(e, value);
                    } catch (UnsupportedEncodingException var9) {
//                        throw new WebUtilsException(var9);
                    }
                }
            }

            return cookieMap;
        }
    }

    public static String getCookieValue(HttpServletRequest httpServletRequest, String name) {
        if(null != httpServletRequest && !StringUtils.isBlank(name)) {
            Cookie[] cookies = httpServletRequest.getCookies();
            if(ArrayUtils.isNotEmpty(cookies)) {
                Cookie[] var3 = cookies;
                int var4 = cookies.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    Cookie cookie = var3[var5];
                    String cookieName = cookie.getName();
                    String cookieValue = cookie.getValue();
                    if(name.equals(cookieName)) {
                        try {
                            return new String(Base64.decodeBase64(cookieValue), "UTF-8");
                        } catch (UnsupportedEncodingException var10) {
//                            throw new WebUtilsException(var10);
                        }
                    }
                }
            }

            return null;
        } else {
            throw new IllegalArgumentException("参数错误");
        }
    }

    public static Cookie getCookie(HttpServletRequest httpServletRequest, String name) {
        if(null != httpServletRequest && !StringUtils.isBlank(name)) {
            Cookie[] cookies = httpServletRequest.getCookies();
            if(ArrayUtils.isNotEmpty(cookies)) {
                Cookie[] var3 = cookies;
                int var4 = cookies.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    Cookie cookie = var3[var5];
                    String cookieName = cookie.getName();
                    if(name.equals(cookieName)) {
                        return cookie;
                    }
                }
            }

            return null;
        } else {
            throw new IllegalArgumentException("参数错误");
        }
    }

    public static void setCookie(HttpServletResponse httpServletResponse, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        setCookie(httpServletResponse, cookie);
    }

    public static void setCookie(HttpServletResponse httpServletResponse, Cookie cookie) {
        if(null != httpServletResponse && null != cookie) {
            httpServletResponse.addCookie(cookie);
        } else {
            throw new IllegalArgumentException("参数错误");
        }
    }
}
