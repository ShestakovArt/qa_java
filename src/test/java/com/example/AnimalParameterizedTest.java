package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String typeAnimal;
    private final List<String> diet;

    public AnimalParameterizedTest(String typeAnimal, List<String> diet){
        this.typeAnimal = typeAnimal;
        this.diet = diet;
    }

    @Parameterized.Parameters
    public static Object[][] getDietData() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
                { "Птица", List.of()},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        try {
            assertEquals(diet, animal.getFood(typeAnimal));
        } catch (Exception thrown) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
        }
    }
}