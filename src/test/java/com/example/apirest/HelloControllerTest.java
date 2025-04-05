package com.example.apirest;

import com.example.apirest.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testSayHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello, Jenkins!", controller.sayHello());
    }
}
