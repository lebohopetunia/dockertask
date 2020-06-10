package com.dockertask.dockertask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/autobuild")
public class autobuild {
    @GetMapping("/auto")
    public String autobuild()
    {
        return "Auto build worked";
    }
}
