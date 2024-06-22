package com.example.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAsserTest {
    List<String> todos= Arrays.asList("Aws","azure","devops");

    @Test
    void test(){
        boolean test=todos.contains("devops");
        boolean test2=todos.contains("asd");
        assertTrue(test,"error message");
        assertEquals(3,todos.size(),"error message");
        assertFalse(test2);
    }
}
