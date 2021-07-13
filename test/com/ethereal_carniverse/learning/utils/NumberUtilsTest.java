package com.ethereal_carniverse.learning.utils;

import org.junit.Test;

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
    public void isFactor() {
        assertTrue(NumberUtils.isFactor(7, 84));
    }

    @Test
    public void isNotFactor() {
        assertFalse(NumberUtils.isFactor(5, 84));
    }

}