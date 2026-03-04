package com.example.utils;

/**
 * StudentUtils - intentionally contains bugs for a unit testing exercise.
 *
 * Students: write tests first, then fix the bugs you discover.
 */
public final class StudentUtils {

    private StudentUtils() {}

    // Grade must be between 0 and 100 (inclusive)
    public static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 101;
    }

    // Passing grade is 40 or above
    public static boolean isPassingGrade(int grade) {
        return grade > 40;
    }

    // Adult = 18+
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // Teenager = 13–17
    public static boolean isTeenager(int age) {
        return age >= 13 && age <= 17;
    }

    // Child = 0–12
    public static boolean isChild(int age) {
        return age < 12;
    }
}
