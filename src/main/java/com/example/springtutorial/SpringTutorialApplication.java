package com.example.springtutorial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringTutorialApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringTutorialApplication.class, args);
    }
}
