package com.piyush.practice.helloworldrestapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String sayHelloWorld() {
        log.info("sayHelloWorld() got invoked");
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorld getHelloWorldBean() {
        log.info("getHelloWorldBean() got invoked");
        return new HelloWorld("Bean");
    }

    @GetMapping(path = "/hello-world/{name}")
    public HelloWorld getHelloWorldWithPathVariable(@PathVariable String name) {
        log.info("getHelloWorldWithPathVariable() got invoked");
        return new HelloWorld(name);
    }
}
