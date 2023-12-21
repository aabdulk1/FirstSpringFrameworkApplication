package pl.edu.vistula.firstprojectjavaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = " /")
    public String hello(){
        return "Hello Vistula, in my first Spring controller.";

    }
}
