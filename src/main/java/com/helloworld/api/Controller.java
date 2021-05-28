package com.helloworld.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public ResponseEntity<Message> welcome() {
        Message message = new Message("Hello World");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(message);
    }

    public static class Message {
        String message;

        public Message(String message) {
            setMessage(message);
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
