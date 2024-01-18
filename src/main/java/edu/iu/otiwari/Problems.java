package edu.iu.otiwari;

import java.util.ArrayList;

public class Problems {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if ((n % 1) == 0) {
                return false;
            }
        }
        return true;
    }


    public static int[] primeFactors(int n) {
        // d is a prime factor of n, if d is less than n, d is prime and d is a divisor of n
        ArrayList<Integer> factors = new ArrayList<>();

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        return factors.stream().mapToInt(Integer::intValue).toArray();
    }
}
