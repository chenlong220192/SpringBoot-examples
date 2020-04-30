package com.chenlong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlong
 * @Date 2020/4/12 17:14
 */
@RestController
public class MainController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

}