package edu.euler.problem16;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler16 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Euler16.class.getName());
        BigInteger bi = BigInteger.valueOf(2);
        bi = bi.pow(1000);
        String s = bi.toString();
        int sum=0;

        for( int i = 0;i < s.length();i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }

        logger.log(Level.INFO, "Answer: {0}",sum);
    }
}
