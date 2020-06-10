package com.dockertask.dockertask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/hellp")
public class hello {
    @GetMapping
    public String hello()
    {
        return "docker is working ";
    }
}
