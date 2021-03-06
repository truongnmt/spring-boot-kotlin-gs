package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping // @GetMapping("springboot") => localhost:8080/api/hello/springboot
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}
