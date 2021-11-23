package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        assertNotNull(animal.getFamily());
    }
}