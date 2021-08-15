package com.ethereal_carniverse.learning.practice.no_proccessing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    private PerfectNumber perfectNumber;

    @Before
    public void setup() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    public void testProcessIsPerfect() {
        assertTrue(perfectNumber.checkPerfectNumber(6));
    }

    @Test
    public void testProcessIsNotPerfect() {
        assertFalse(perfectNumber.checkPerfectNumber(4));
    }

}