package test;

import org.junit.Test;
import solution.MySolution;
import solution.Solution;

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

}
