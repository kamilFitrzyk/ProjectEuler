package edu.euler.problem7;

import edu.euler.problem19.Euler19;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler7 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Euler19.class.getName());

        Long number = 0L;
        int counter = 0;

        while (counter != 10001) {
            number++;
            if (PrimeNumber.isThePrimeNumber(number)) {
                counter++;
            }

        }
        logger.log(Level.INFO, "Answer: 10001st prime number is {0}", number);
    }

}
