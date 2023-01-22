package edu.euler.problem10;

import edu.euler.problem7.PrimeNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler10 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Euler10.class.getName());
        long sumOfPrimeBelowTwoMillion = 0L;
        for (long i = 1; i < 2000000; i++) {
            if (PrimeNumber.isThePrimeNumber(i)) {
                sumOfPrimeBelowTwoMillion += i;
            }
        }
        logger.log(Level.INFO, "Sum prime number under 2 millions: {0}", sumOfPrimeBelowTwoMillion);

    }
}
