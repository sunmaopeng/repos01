package com.itehima.service.impl;

import com.itehiam.dao.ItemsDao;
import com.itehiam.domain.Items;
import com.itehima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    ItemsDao itemsDao;
    public Items findByid(Integer id) {

        return itemsDao.findByid(id);
    }
}
