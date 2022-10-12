package com.sample;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String index(@CurrentSecurityContext(expression="authentication") Authentication authentication) {
        return "Hello World! " + authentication.getPrincipal();
    }
}
