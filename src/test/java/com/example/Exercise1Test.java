package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {
    @Test
    public void testAdd() {
        assertEquals(5, Exercise1.getSum(2,3));
    }
}