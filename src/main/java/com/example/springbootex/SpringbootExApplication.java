package com.example.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class SpringbootExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExApplication.class, args);
    }


}
