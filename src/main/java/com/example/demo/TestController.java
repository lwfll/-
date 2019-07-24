package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lwf
 * @Description //TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/hello")
    public String test() {
        return "hello";
    }




}
