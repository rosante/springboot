package com.digitalinnovationone.springboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/home")
class HomeController {
    @GetMapping
    fun Home():String = "Home Page Spring Boot"

}