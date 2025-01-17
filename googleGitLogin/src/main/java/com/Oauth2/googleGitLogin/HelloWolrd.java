package com.Oauth2.googleGitLogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWolrd {

    @GetMapping("/")
    public String greet(){
        return "Hello Google auth";
    }
}
