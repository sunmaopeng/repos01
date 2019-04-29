package com.itheima.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverterImpl implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if (source ==null){
            throw new RuntimeException("参数为空");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(source);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("日期转换异常");
        }
    }
}
