package com.iot.hardware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        log.debug("按时一些");
        return "hello,this is a springboot demo";
    }
}
