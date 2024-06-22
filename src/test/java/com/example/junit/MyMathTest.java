package com.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {
    MyMath myMath= new MyMath();

    @Test
    void calculateThreeMemberArray(){
        assertEquals(myMath.calculateSum(new int[]{10,20,30}),60);

    }
    @Test
    void calculateZeroArray(){
        int expected=0;

        assertEquals(myMath.calculateSum(new int[] {}),0);

    }
}
