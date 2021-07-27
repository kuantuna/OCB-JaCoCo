package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getName() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Tuna", hw.getName("Tuna"));
    }
}