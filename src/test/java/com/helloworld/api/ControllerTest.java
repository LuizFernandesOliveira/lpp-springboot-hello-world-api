package com.helloworld.api;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;

@WebMvcTest
public class ControllerTest {
    @Autowired
    private Controller controller;

    @BeforeEach
    public void setup() {
        standaloneSetup(this.controller);
    }

    @Test
    public void shouldReturnOkAndMessage_WhenGetWelcome() {
        given().accept(ContentType.JSON)
                .when().get("/welcome")
                .then().statusCode(HttpStatus.OK.value())
                .body("message", Matchers.equalTo("Hello World"));
    }
}
