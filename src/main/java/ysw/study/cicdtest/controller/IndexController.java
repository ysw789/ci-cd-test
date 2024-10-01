package ysw.study.cicdtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ysw.study.cicdtest.service.SecretsManagerService;

@RestController
public class IndexController {
    @Value("${my-first-secret}")
    private String myFirstSecret;

//    private final SecretsManagerService secretsManagerService;
//
//    public IndexController(SecretsManagerService secretsManagerService) {
//        this.secretsManagerService = secretsManagerService;
//    }

    @GetMapping("/")
    public String index() {
        return myFirstSecret;
    }
}
