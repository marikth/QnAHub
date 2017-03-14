package com.qnahub.rest_api.web;

import com.qnahub.common.environment.Environment;
import com.qnahub.rest_api.controller.WebConstants;
import com.qnahub.rest_api.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.qnahub.rest_api.controller.WebConstants.LOGIN_REST_PATH;

/**
 * Created by markth on 12/10/2016.
 */
public class SpringSecurityFilterChain implements Filter {




    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.print("asdads");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String pathInfo = req.getPathInfo();
//
//        if(!LOGIN_REST_PATH.equals(pathInfo)) {
//            Cookie cookie = CookieUtil.getCookie(WebConstants.AUTH_TOKEN, req);
//            if (cookie != null) {
//
                filterChain.doFilter(servletRequest, servletResponse);
//            }
//        }
//
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        response.setContentType("what you need");
//        PrintWriter writer = response.getWriter();

    }

    @Override
    public void destroy() {

    }


}
