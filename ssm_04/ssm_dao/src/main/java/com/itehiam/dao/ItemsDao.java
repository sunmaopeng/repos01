package com.itehiam.dao;

import com.itehiam.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    @Select("select * from items where id=#{id}")
    Items findByid(Integer id);
}
