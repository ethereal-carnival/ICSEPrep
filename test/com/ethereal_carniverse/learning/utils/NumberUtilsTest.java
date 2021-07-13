package com.ethereal_carniverse.learning.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    @Test
    public void isPerfect() {
        assertTrue(NumberUtils.isPerfect(6));
    }

    @Test
    public void isNotPerfect() {
        assertFalse(NumberUtils.isPerfect(7));
    }

    @Test
    public void isPalindrome() {
        assertTrue(NumberUtils.isPalindrome(14941));
    }

    @Test
    public void isNotPalindrome() {
        assertFalse(NumberUtils.isPalindrome(144941));
    }

    @Test
    public void isPrime() {
        assertTrue(NumberUtils.isPrime(7));
    }

    @Test
    public void isNotPrime() {
        assertFalse(NumberUtils.isPalindrome(39));
    }

    @Test
    public void factorial() {
        assertEquals(120, NumberUtils.factorial(5));
    }

    @Test
    public void factorialForNegative() {
        assertEquals(1, NumberUtils.factorial(-5));
    }

    @Test
    public void gcdCoPrimes() {
        assertEquals(1, NumberUtils.gcd(13, 7));
    }

    @Test
    public void gcd() {
        assertEquals(12, NumberUtils.gcd(24, 36));
    }

    @Test
    public void isFactor() {
        assertTrue(NumberUtils.isFactor(7, 84));
    }

    @Test
    public void isNotFactor() {
        assertFalse(NumberUtils.isFactor(5, 84));
    }

}