package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LeoAlexTest {

    @Mock
    Feline feline;

    @Test
    public void testGetPlaceOfLiving() throws Exception{
        LeoAlex alex = new LeoAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        LeoAlex alex = new LeoAlex(feline);
        assertEquals(0, alex.getKittens());
    }
}