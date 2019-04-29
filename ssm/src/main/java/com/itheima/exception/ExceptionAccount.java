package com.itheima.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionAccount implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        Exception exception = e;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("erro",exception.getMessage());
        modelAndView.setViewName("e");
        return modelAndView;
    }
}
