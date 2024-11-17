package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAppOutput() {
        String expectedOutput = "Hello, Maven Project!";
        assertEquals(expectedOutput, "Hello, Maven Project!");
    }
}
