package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	@RequestMapping(value = "/welcome")
	   public String hello() {
	      return "Hello World";
	   }

}
