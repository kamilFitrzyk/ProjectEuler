package edu.euler.problem9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler9 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Euler9.class.getName());
        for (int a = 1; a < 600; a++) {
            for (int b = 1; b < 600; b++) {
                for (int c = 1; c < 600; c++) {
                    if (a * a + b * b == c * c && a + b + c == 1000 && c > b && b > a) {
                        logger.log(Level.INFO, "{0}", a * b * c);

                    }
                }


            }
        }
    }
}
