package com.springboot.demo.helloworld.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping(name = "helloWorld", value = "/helloWorld",
          method = RequestMethod.GET ,
          produces = MediaType.APPLICATION_JSON_VALUE)
  public String helloWord() {
    return "Hello World";
  }
}
