package com.example.springboot01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cky
 * @Description: hello控制接口
 * @date 2021.09.07 17:55
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public @ResponseBody String hello(){
        return "hello world";
    }
}
