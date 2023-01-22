package edu.euler.problem7;

public final class PrimeNumber {
    public static boolean isThePrimeNumber(Long number) {

        long c = 2L;

        if (number <= 1) return Boolean.FALSE;

        for (Long i = 2L; i < number; i++) {
            if (number % i == 0) {
                c++;
                break;
            }
        }
        if (c == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private PrimeNumber() {
    }
}
