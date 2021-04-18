package com.ahmetgeymen.web.foo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping
    fun getHello(
        @RequestParam(value = "name", defaultValue = "World") name: String
    ) = "Hello $name!"
}