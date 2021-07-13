package com.ethereal_carniverse.learning.menu_based;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ComputronTest {

    Computron computronTester;

    @Before
    public void setUp() throws Exception {
        computronTester = new Computron();
    }

    @Test
    public void isNotPrime1() {
        assertFalse(computronTester.isPrime(1));
    }

    @Test
    public void isPrime2() {
        assertTrue(computronTester.isPrime(2));
    }

    @Test
    public void isPrime3() {
        assertTrue(computronTester.isPrime(3));
    }

    @Test
    public void isNotPrime4() {
        assertFalse(computronTester.isPrime(4));
    }

    @Test
    public void isArmstrong371() {
        assertTrue(computronTester.isArmstrong(371));
    }

    @Test
    public void isNotArmstrong145() {
        assertFalse(computronTester.isArmstrong(145));
    }

    @Test
    public void countLetters() {
        String testSentence = "This is a test statement with some letter and special characters and 1 digit.";
        int numberOfLetters = computronTester.countLetters(testSentence);
        assertEquals(62, numberOfLetters);
    }

    @Test
    public void countLettersEmtpySentence() {
        String testSentence = "";
        int numberOfLetters = computronTester.countLetters(testSentence);
        assertEquals(0, numberOfLetters);
    }
}