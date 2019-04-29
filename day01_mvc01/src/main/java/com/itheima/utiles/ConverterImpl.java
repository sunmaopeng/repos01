package com.itheima.utiles;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverterImpl implements Converter<String,Date>{

    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("数据为空");
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date data = dateFormat.parse(source);
            return data;
        } catch (ParseException e) {
            throw new RuntimeException("数据转换错误");
        }
    }
}
