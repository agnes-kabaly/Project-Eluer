package test;

import org.junit.Test;
import solution.MySolution;
import solution.Solution;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new MySolution();

    @Test
    public void multiples() throws Exception {
        assertEquals(23, solution.multiples(10));
        assertEquals(57918, solution.multiples(500));
        assertEquals(233168, solution.multiples(1000));
    }

    @Test
    public void multiplesOf3And5() throws Exception {
        assertEquals(23, solution.multiplesOf3And5(10));
        assertEquals(57918, solution.multiplesOf3And5(500));
        assertEquals(233168, solution.multiplesOf3And5(1000));
    }

    @Test
    public void multiplesTWO() throws Exception {
        assertEquals(23, solution.multiplesTWO(10));
        assertEquals(57918, solution.multiplesTWO(500));
        assertEquals(233168, solution.multiplesTWO(1000));
    }

    @Test
    public void evenFibonacciNumbers() throws Exception {
        assertTrue(BigInteger.valueOf(44).equals(solution.evenFibonacciNumbers(BigInteger.valueOf(45))));
        assertTrue(BigInteger.valueOf(14328).equals(solution.evenFibonacciNumbers(BigInteger.valueOf(14328))));
        assertTrue(BigInteger.valueOf(4613732).equals(solution.evenFibonacciNumbers(BigInteger.valueOf(4000000))));
    }

    @Test
    public void largestPrimeFactor() throws Exception {
        assertArrayEquals(new int[]{5, 7, 13, 29}, solution.largestPrimeFactor(13195));
        assertArrayEquals(new int[]{71, 839, 1471, 6857}, solution.largestPrimeFactor(600851475143L));
    }

    @Test
    public void largestPalindrome() throws Exception {
        assertEquals(9009, solution.largestPalindrome(99, 99));
        assertEquals(698896, solution.largestPalindrome(850, 850));
        assertEquals(289982, solution.largestPalindrome(540, 550));
        assertEquals(906609, solution.largestPalindrome(999, 999));
    }

    @Test
    public void smallestMultiple() throws Exception {
        assertEquals(2520, solution.smallestMultiple(10));
        //assertEquals(232792560, solution.smallestMultiple(20));
    }

    @Test
    public void sumSquareDifference() throws Exception {
        assertEquals(2640, solution.sumSquareDifference(10));
        assertEquals(25164150, solution.sumSquareDifference(100));
    }

    @Test
    public void prime10001st() throws Exception {
        assertEquals(13, solution.prime10001st(6));
        //assertEquals(104743, solution.prime10001st(10001));
    }

    @Test
    public void largestProductSeries() throws Exception {
        assertEquals(5832, solution.largestProductSeries(4));
        assertEquals(23514624000L, solution.largestProductSeries(13));
        assertEquals(9, solution.largestProductSeries(1));
        assertEquals(81, solution.largestProductSeries(2));
        assertEquals(648, solution.largestProductSeries(3));
    }

    @Test
    public void specialPythagoreanTriplet() throws Exception {
        assertEquals(new int[]{200, 375, 425}, solution.specialPythagoreanTriplet(1000));
    }

}
