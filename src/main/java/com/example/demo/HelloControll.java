package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    /**
     * 测试控制器
     *
     * @author: @我没有三颗心脏
     * @create: 2018-05-08-下午 16:46
     */
    @RestController
    public class HelloControll {

        @RequestMapping("/hello")
        public String hello() {
            return "Hello Spring Boot!";
        }

        @RequestMapping("/helloworld")
        public String helloWorld() {
            return "Hello Spring Boot! Test ddd World!";
        }
        @RequestMapping("/getname")
        public String getName() {
            return " what is your name ! ";
        }

    }

