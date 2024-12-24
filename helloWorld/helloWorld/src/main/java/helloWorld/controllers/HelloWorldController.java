package helloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping({"/hello", "/hola"})
    public String helloWorld() {
        return "Hello World";
    }
}
