package com.ideas.parametrized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
     void testLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertFalse(LeapYear.isLeapYear(1900));
        assertTrue(LeapYear.isLeapYear(2004));
        assertFalse(LeapYear.isLeapYear(2001));
    }
}
