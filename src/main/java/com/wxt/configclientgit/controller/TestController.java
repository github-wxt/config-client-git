package com.wxt.configclientgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈类描述〉
 * 〈〉
 *
 * @author 67563
 * @create 2021/6/14
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/getName")
    public String getName(){
        return "在工行";
    }
}
