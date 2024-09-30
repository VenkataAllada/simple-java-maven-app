package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetMessage() {
        App app = new App();
        String expectedMessage = "Hello, Java 17 with Maven!";
        assertEquals(expectedMessage, app.getMessage());
    }
}

