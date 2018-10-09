package com.malaxiaoyugan.servicemessage.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "mailmessage")
public class MailMessageController {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(){


        return "你好";

    }



    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
