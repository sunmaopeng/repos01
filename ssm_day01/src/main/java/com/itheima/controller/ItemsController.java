package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mm")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @RequestMapping("/items")
    public String items(Model model){
        Items items = itemsService.findByid(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
