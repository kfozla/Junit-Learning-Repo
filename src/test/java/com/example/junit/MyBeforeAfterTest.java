package com.example.junit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @Test
    void Test1(){
        System.out.println("Test1");
    }
    @Test
    void Test2(){
        System.out.println("Test2");
    }
    @Test
    void Test3(){
        System.out.println("Test3");
    }
}
