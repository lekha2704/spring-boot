package com.lekha.restful.prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracController {

    @GetMapping(path = "/hello/{name}")
    public PracBean hello(@PathVariable String name){
        return new PracBean(String.format("Hello %s", name));
    }
}
