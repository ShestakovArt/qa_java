package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedSex;

    public LionParameterizedTest(String sex, boolean expectedSex){
        this.sex = sex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
                { "Пол животного неизвестен", true},
        };
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline feline;


    @Test
    public void testDoesHaveMane() {
        try {
            Lion lion = new Lion(feline, sex);
            assertEquals(expectedSex, lion.doesHaveMane());
        } catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
}