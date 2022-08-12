package com.hellodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/hello-docker")
    public HelloDocker get(){

        var hostName = System.getenv("HOSTNAME");
        return new HelloDocker("Hello Docker", hostName);
    }
}
