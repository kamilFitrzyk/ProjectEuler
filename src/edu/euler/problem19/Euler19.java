package edu.euler.problem19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Euler19 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Euler19.class.getName());

        LocalDate start = LocalDate.of(1901, 1, 1);
        LocalDate stop = LocalDate.of(2001, 1, 1);

        int counter = 0;

        do {
            if (start.getDayOfWeek() == DayOfWeek.SUNDAY && start.getDayOfMonth() == 1) {
                counter++;
            }
            start = start.plusMonths(1);
        } while (start.isBefore(stop));

        logger.log(Level.INFO, "Answer: {}", counter);
    }
}
