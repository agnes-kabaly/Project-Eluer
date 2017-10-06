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

}
