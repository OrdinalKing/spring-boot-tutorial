package com.kristoff.springbootdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Example {
   @RequestMapping("/")
   @ResponseBody
   public String hello() {
      return "Hello Spring Boot";
   }
}