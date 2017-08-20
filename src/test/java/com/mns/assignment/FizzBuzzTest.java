package com.mns.assignment;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;
    
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void testIsDivisibleByThreeTrueCase() {
        assertTrue(fizzBuzz.isDivisibleByThree(3));
        assertTrue(fizzBuzz.isDivisibleByThree(999999));
    }
        
    @Test
    public void testIsDivisibleByThreeFalseCase() {
        assertFalse(fizzBuzz.isDivisibleByThree(2));
        assertFalse(fizzBuzz.isDivisibleByThree(77777777));
    }
    
    @Test
    public void testIsDivisibleByFiveTrueCase() {
        assertTrue(fizzBuzz.isDivisibleByFive(5));
        assertTrue(fizzBuzz.isDivisibleByFive(5555550));
    }
    
    @Test
    public void testIsDivisibleByFiveFalseCase() {
        assertFalse(fizzBuzz.isDivisibleByFive(19));
        assertFalse(fizzBuzz.isDivisibleByFive(555555559));
    }
        
    @Test
    public void testIsDivisibleBy3and5TrueCase() {
        assertTrue(fizzBuzz.isDivisibleBy3and5(15));
        assertTrue(fizzBuzz.isDivisibleBy3and5(900));
    }
    
    @Test
    public void testIsDivisibleBy3and5FalseCase() {
        assertFalse(fizzBuzz.isDivisibleBy3and5(20));
        assertFalse(fizzBuzz.isDivisibleBy3and5(24));
    }
    
    @Test 
    public void testGetFizzBuzzStringForNumDivisibleby3and5() {
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzString(45));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzString(15));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzString(9000));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzString(180));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzString(9990));
    }
    
    @Test 
    public void testGetFizzBuzzStringForNumDivisibleby3() {
        assertEquals("Fizz", fizzBuzz.getFizzBuzzString(99));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzString(999999999));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzString(666666666));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzString(27));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzString(81));
    }
    
    @Test 
    public void testGetFizzBuzzStringForNumDivisibleby5() {
        assertEquals("Buzz", fizzBuzz.getFizzBuzzString(10));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzString(999999995));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzString(666666665));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzString(400));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzString(150000005));
    }
    
    @Test 
    public void testGetFizzBuzzStringForOtherNumbers() {
        assertEquals("22", fizzBuzz.getFizzBuzzString(22));
        assertEquals("77", fizzBuzz.getFizzBuzzString(77));
        assertEquals("44444", fizzBuzz.getFizzBuzzString(44444));
        assertEquals("88", fizzBuzz.getFizzBuzzString(88));
        assertEquals("1111111111", fizzBuzz.getFizzBuzzString(1111111111));
    }
}
