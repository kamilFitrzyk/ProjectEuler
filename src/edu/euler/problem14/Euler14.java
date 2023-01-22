package edu.euler.problem14;

import edu.euler.problem17.Euler17;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler14 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Euler17.class.getName());

        long max = 0L;
        long maxnr = 0L;
        long counter = 0L;
        long i = 0L;

        Map<Long, Long> cache = new HashMap<>();
        long startTime = System.nanoTime();
        for (long x = 1L; x < 1000000L; x++) {
            counter = 1L;

            i = x;
            do {

                if (cache.containsKey(i)) {
                    counter += cache.get(i);
                    break;
                }

                if ((i % 2L) == 0L) {
                    i = i / 2L;
                } else {
                    i = i * 3 + 1;
                }
                counter = counter + 1L;
            } while (i != 1L);

            cache.put(x, counter);

            if (counter > maxnr) {
                max = x;
                maxnr = counter;

            }

        }
        logger.log(Level.INFO, "Answer: the Longest chain: {0}", max);
        logger.log(Level.INFO, "Answer: the Longest chain: {0} ", maxnr);


        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        logger.log(Level.INFO, "Answer: duration: {0} ", duration);
    }
}
