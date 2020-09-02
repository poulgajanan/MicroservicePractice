package com.gp.FreshGoods.OnlineShopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class CheckingProductControl {

    @GetMapping("/healthcheck")
    public String display(){
        return "Hello and welcome to the gp show";
    }
}
