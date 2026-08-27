package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //gate-way to write API end-points
public class HelloController {

  @GetMapping("hello")
  public String hello() {
    return "<h1>First SpringBoot Application<h1>";
  }
}
