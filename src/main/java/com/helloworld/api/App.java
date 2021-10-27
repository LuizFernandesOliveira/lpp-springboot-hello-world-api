package com.helloworld.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/welcome")
    public ResponseEntity<Message> welcome() {
        Message message = new Message("Hello World");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(message);
    }

    @Getter
    @AllArgsConstructor
    public static class Message {
        String message;
    }

}
