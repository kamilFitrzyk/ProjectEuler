package edu.euler.problem20;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Problem20 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Problem20.class.getName());
        BigInteger multiple = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        BigInteger add = BigInteger.valueOf(1);


        for (int i = 1; i <= 100; i++) {

            multiple = multiple.multiply(c);
            c = c.add(add);
        }

        String multipleString = multiple.toString();

        int answer = 0;

        for (int i = 0; i < multipleString.length(); i++) {
            answer += Integer.parseInt(multipleString.substring(i,i+1));
        }

        logger.log(Level.INFO, "Answer: {0}", answer);

    }
}
