package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Set up an empty CustomList before each test.
     */
    @Before
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    /**
     * Test that adding a city increases the size of the list.
     */
    @Test
    public void testAddCity() {
        int initialSize = list.countCities();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(initialSize + 1, list.countCities());
    }

    /**
     * Test that hasCity returns true when the city is in the list.
     */
    @Test
    public void testHasCity() {
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city));  // Initially, it should be false

        list.addCity(city);
        assertTrue(list.hasCity(city));   // After adding, it should be true
    }

    /**
     * Test that deleteCity removes a city from the list.
     */
    @Test
    public void testDeleteCity() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));  // City should be in the list

        list.deleteCity(city);
        assertFalse(list.hasCity(city));  // City should no longer be in the list
    }

    /**
     * Test that countCities returns the correct number of cities in the list.
     */
    @Test
    public void testCountCities() {
        assertEquals(0, list.countCities());  // Should be 0 initially

        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.countCities());  // Should be 1 after adding a city
    }
}
