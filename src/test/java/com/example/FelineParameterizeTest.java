package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizeTest {

    private final int numberOffspring;
    private final int expectedOffspring;

    public FelineParameterizeTest(int numberOffspring, int expectedOffspring){
        this.numberOffspring = numberOffspring;
        this.expectedOffspring = expectedOffspring;
    }

    @Parameterized.Parameters
    public static Object[][] getOffspringData() {
        return new Object[][] {
                { 2, 2},
                { 5, 5},
        };
    }

    @Test
    public void testTestGetKittens() {
        Feline feline = new Feline();
        assertEquals(expectedOffspring, feline.getKittens(numberOffspring));
    }
}