package edu.iu.otiwari;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class ProblemsTest {

    @Test
    void isPrime() {
        assertTrue(Problems.isPrime(17));
        assertFalse(Problems.isPrime(465));
        assertTrue(Problems.isPrime(7919));


    }

    @Test
    void primeFactors() {
        int[] a1 = {};
        int[] a2 = {3, 5};
        int[] a3 = {61, 113};

        assertEquals(a1,Problems.primeFactors(17));
        assertEquals(a2,Problems.primeFactors(15));
        assertEquals(a3,Problems.primeFactors(6893));
    }
}