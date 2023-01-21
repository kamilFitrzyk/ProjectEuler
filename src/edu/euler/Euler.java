package edu.euler;

import java.util.HashMap;
import java.util.Map;

public class Euler {

    public void run() {
        long max = 0L;
        long maxnr = 0L;
        long counter = 0L;
        long i = 0L;

        Map<Long, Long> cache = new HashMap<>();
        long startTime = System.nanoTime();
        for (long x = 1L; x < 1000000L; x++) {
            //System.out.print("For: " + x);
            counter = 1L;


            i=x;
            do {

                if (cache.containsKey(i)) {
                    counter+=cache.get(i);
                    break;
                }


                if ((i % 2L) == 0L) {
                    i = i/2L;
                    //System.out.print(" -> " + i);
                } else {
                    i = i*3+1;
                    //System.out.print(" -> " + i);
                }
                counter = counter + 1L;
            } while (i!=1L);

            cache.put(x, counter);

            //System.out.println(", length chain: " + counter);
            //System.out.print(" " + counter);
            if (counter > maxnr) {
                max = x;
                maxnr = counter;

            }

        }
        System.out.println("the Longest chain: " + max);
        System.out.println("the Longest chain: " + maxnr);


        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
    }

}
