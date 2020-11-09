package com.codedifferently.day04Friday;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum =0;
        for(int i = n-1; i > 0; i--){
        sum = sum +i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reversed = 0;
        for (; val != 0; val /= 10) {
            int digit = val % 10;
                reversed = reversed * 10 + digit;
            }
    return reversed;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        boolean isEven = val%2==0;
        return isEven;
    }
}
