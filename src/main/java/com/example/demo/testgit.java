package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

public class testgit {
    public class HelloController {
        private String content;
        public String hello() {
            return content+"11";
        }
    }
}
