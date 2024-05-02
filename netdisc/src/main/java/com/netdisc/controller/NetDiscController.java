package com.netdisc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetDiscController {

    @RequestMapping("/netdisc")
    public String testdisc(){

        return "这是我的私人开发定制网盘!";
    }

}
