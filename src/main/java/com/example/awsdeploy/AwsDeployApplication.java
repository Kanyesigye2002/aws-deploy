package com.example.awsdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class AwsDeployApplication {

    @GetMapping("/")
    public String showUserList() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsDeployApplication.class, args);
    }

}
