package edu.iu.otiwari;

import java.util.ArrayList;

public class Problems {
    static  boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=n/2;i++) {
            if((n%i)==0)
                return  false;
        }
        return true;
    }





    public static int[] primeFactors(int n) {
        int[] factors = new int[20];
        int factorsCount = 0;

        while (n % 2 == 0) {
            factors[factorsCount++] = 2;
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors[factorsCount++] = i;
                n /= i;
            }
        }

        if (n > 2) {
            factors[factorsCount++] = n;
        }

        if (factorsCount < factors.length) {
            int[] newFactors = new int[factorsCount];
            System.arraycopy(factors, 0, newFactors, 0, factorsCount);
            factors = newFactors;
        }

        for (int i = 0; i < factorsCount - 1; i++) {
            for (int j = 0; j < factorsCount - i - 1; j++) {
                if (factors[j] > factors[j + 1]) {
                    int temp = factors[j];
                    factors[j] = factors[j + 1];
                    factors[j + 1] = temp;
                }
            }
        }
        return factors;
    }
}
