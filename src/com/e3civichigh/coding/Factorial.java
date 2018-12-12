package com.e3civichigh.coding;

public class Factorial
{
    public static void main(String[] args)
    {
        final int NUM_FACTS = 100;

        // TODO 1: Please create a for loop that counts from 0 up to NUM_FACTS
        for (int i = 0; i < NUM_FACTS; i ++) {
            System.out.println(i + "! is " + factorial(i));
        }
    }

    /**
     * factorial computes n!
     *
     * @param n
     * @return n factorial
     */
    public static int factorial(int n)
    {
        int result = 1;
        // TODO 2: Please create a for loop that counts from 2 up to and including n
        for(int i = 0; i <= n; i += 2) {
            result *= i;
        }

        return result;
    }
}
