package edu.euler.problem17;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler17 {


    public static void main(String[] args) {
        Map<Integer, Integer> numberCounterMap = new HashMap<>();
        Logger logger = Logger.getLogger(Euler17.class.getName());

        numberCounterMap.put(0, 0);
        numberCounterMap.put(1, 3);
        numberCounterMap.put(2, 3);
        numberCounterMap.put(3, 5);
        numberCounterMap.put(4, 4);
        numberCounterMap.put(5, 4);
        numberCounterMap.put(6, 3);
        numberCounterMap.put(7, 5);
        numberCounterMap.put(8, 5);
        numberCounterMap.put(9, 4);
        numberCounterMap.put(10, 3);
        numberCounterMap.put(11, 6);
        numberCounterMap.put(12, 6);
        numberCounterMap.put(13, 8);
        numberCounterMap.put(14, 8);
        numberCounterMap.put(15, 7);
        numberCounterMap.put(16, 7);
        numberCounterMap.put(17, 9);
        numberCounterMap.put(18, 8);
        numberCounterMap.put(19, 8);
        numberCounterMap.put(20, 6);
        numberCounterMap.put(30, 6);
        numberCounterMap.put(40, 5);
        numberCounterMap.put(50, 5);
        numberCounterMap.put(60, 5);
        numberCounterMap.put(70, 7);
        numberCounterMap.put(80, 6);
        numberCounterMap.put(90, 6);
        numberCounterMap.put(100, 7);
        numberCounterMap.put(1000, 5);

        int counter = 0;

        for (int number = 1; number <= 1000; number++) {
            if (number == 1000) {
                counter += numberCounterMap.get(1);
                counter += numberCounterMap.get(1000);
                counter += 3;
            } else {

                int restOfTon = number % 100;
                int tons = (number - restOfTon) / 100;

                int restOfDozens = restOfTon % 10;
                int dozens = (restOfTon - restOfDozens) / 10;

                if (tons >= 1) {
                    counter += numberCounterMap.get(tons);
                    counter += numberCounterMap.get(100);
                }
                if (tons >= 1 && restOfTon != 0) {
                    counter += 3;
                }
                if (restOfTon <= 19) {
                    counter += numberCounterMap.get(restOfTon);
                } else {
                    counter += numberCounterMap.get(restOfDozens);
                    counter += numberCounterMap.get(dozens * 10);
                }

            }
        }
        logger.log(Level.INFO, "Answer: Euler17: {}", counter);

    }


}
