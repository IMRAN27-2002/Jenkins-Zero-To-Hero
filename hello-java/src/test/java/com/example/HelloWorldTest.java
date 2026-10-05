package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testHelloWorld() {

        String message = "Hello World from Maven + Jenkins!";

        assertEquals(
            "Hello World from Maven + Jenkins!",
            message
        );
    }
}