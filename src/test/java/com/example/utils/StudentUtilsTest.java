package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentUtilsTest {

    // ---------------------------
    // Starter tests (examples)
    // ---------------------------

    @Test
    void validGrade_middleValue_isTrue() {
        assertTrue(StudentUtils.isValidGrade(75));
    }

    @Test
    void adult_boundary18_isTrue() {
        assertTrue(StudentUtils.isAdult(18));
    }

    // ---------------------------
    // TODO: Students add tests below
    // Aim for ~12-16 tests total.
    // ---------------------------

    // TODO: isValidGrade boundaries: 0, 100, -1, 101
    // Example:
    // @Test void grade_boundary0_isTrue() { ... }

    // TODO: isPassingGrade boundaries: 39 false, 40 true, 41 true

    // TODO: isTeenager boundaries: 12 false, 13 true, 17 true, 18 false

    // TODO: isChild boundaries: -1 false, 0 true, 12 true, 13 false

    // TIP: When you add boundary tests, you should discover failing tests.
    // Then fix the bugs in StudentUtils.java and re-run mvn test.
}
