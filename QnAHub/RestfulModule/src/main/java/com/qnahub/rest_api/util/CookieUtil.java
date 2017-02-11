package com.qnahub.rest_api.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by markth on 12/10/2016.
 */
public class CookieUtil {
    public static Cookie getCookie(String name, HttpServletRequest req) {
        Cookie[] cookies = req.getCookies();
        if(cookies == null)
            return null;
        for (Cookie cookie : cookies) {
            if(name.equals(cookie.getName()))
                return cookie;
        }
        return null;
    }
}
