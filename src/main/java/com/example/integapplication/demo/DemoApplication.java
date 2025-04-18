package com.example.integapplication.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication {

	public static void main (String[] args){
		SpringApplication.run(DemoApplication.class, args);
}
@GetMapping ("/hello")
public  String hello(@RequestParam(value = "name") String name){
	return String.format("Hello, %s", name);
}
@GetMapping("/hello")
public String home(){
	return "/integrative_home.html";

}
}