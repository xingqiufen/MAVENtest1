package com.xqf.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/demo")
    public String demo(String a, Model model){
        model.addAttribute("msg",a);
        return "hello";
    }

    @RequestMapping("/demo1")
    public String demo1(){

        return "hello";
    }

}
