package com.yqyan.springboot.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yanyaqiang
 * @Date 2019/4/12 18:00
 **/

@RestController
public class TestController {

    @GetMapping("/test")
    public String home(){
        return "Hello World";
    }

}
