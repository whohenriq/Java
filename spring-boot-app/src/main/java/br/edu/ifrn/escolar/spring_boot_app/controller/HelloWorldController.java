package br.edu.ifrn.escolar.spring_boot_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrn.escolar.spring_boot_app.domain.User;
import br.edu.ifrn.escolar.spring_boot_app.service.HelloWorldService;


@RestController
@RequestMapping("/api/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("")
    public String helloWorld() {
        return helloWorldService.helloWorld("Henrique");
    }

    @PostMapping("")
    public String helloWorld(@RequestBody User entity) {
        return helloWorldService.helloWorld(entity.getName());
    }
    
    
}
