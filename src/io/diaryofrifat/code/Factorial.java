package io.diaryofrifat.code;

public class Factorial {
    public static long calculateFactorial(long number) {
        return number == 0 ? 1 : number * calculateFactorial(number - 1);
    }
}
