package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    // ===== perimeter =====
    @Test
    void testPerimeter() {
        assertEquals(10, MathUtils.perimeter(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.perimeter(0, 3));
    }

    // ===== area =====
    @Test
    void testArea() {
        assertEquals(6, MathUtils.area(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.area(-1, 3));
    }

    // ===== solveQuadratic =====
    @Test
    void testSolveQuadratic() {
        assertEquals("Two roots", MathUtils.solveQuadratic(1, -3, 2));
        assertEquals("Double root", MathUtils.solveQuadratic(1, 2, 1));
        assertEquals("No real roots", MathUtils.solveQuadratic(1, 0, 1));
        assertEquals("One root", MathUtils.solveQuadratic(0, 2, -4));
        assertEquals("No solution", MathUtils.solveQuadratic(0, 0, 1));
    }

    // ===== daysInMonth =====
    @Test
    void testDaysInMonth() {
        assertEquals(31, MathUtils.daysInMonth(1, 2023));
        assertEquals(30, MathUtils.daysInMonth(4, 2023));
        assertEquals(28, MathUtils.daysInMonth(2, 2023));
        assertEquals(29, MathUtils.daysInMonth(2, 2024));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.daysInMonth(13, 2023));
    }

    // ===== isPrime =====
    @Test
    void testIsPrime() {
        assertTrue(MathUtils.isPrime(7));
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(9));
    }

    // ===== sumAlternating =====
    @Test
    void testSumAlternating() {
        assertEquals(2, MathUtils.sumAlternating(3)); // 1-2+3
        assertEquals(-2, MathUtils.sumAlternating(4)); // 1-2+3-4
    }

    // ===== gcd =====
    @Test
    void testGCD() {
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.gcd(0, 0));
    }

    // ===== factorial =====
    @Test
    void testFactorial() {
        assertEquals(120, MathUtils.factorial(5));
        assertEquals(1, MathUtils.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    // ===== sumFactorial =====
    @Test
    void testSumFactorial() {
        assertEquals(9, MathUtils.sumFactorial(3)); // 1!+2!+3!
    }

    // ===== constructor (coverage trick) =====
    @Test
    void testConstructor() {
        new MathUtils();
    }
}