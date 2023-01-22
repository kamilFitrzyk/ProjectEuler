package edu.euler.problem25;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler25 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Euler25.class.getName());
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger f2 = BigInteger.valueOf(1);

        int counter = 2;

        while(f2.toString().length() < 1000) {
            counter++;
            BigInteger tmp = f2.add(f1);
            f1 = f2;
            f2 = tmp;
        }

        logger.log(Level.INFO, "It is {0} number: {1}", new Object[] {counter,f2});

    }

}
