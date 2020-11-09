package com.codedifferently.day03Thursday;

import com.codedifferently.day02Wednesday.BasicStringUtils;

import java.util.Arrays;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum=0;
        for(Integer i : intArray){
        sum += i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer product=1;
        for(Integer i : intArray){
            product *= i;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
            Integer sum = IntegerArrayUtils.getSum( intArray);
            Double average = Double.valueOf(sum / intArray.length);
            return average;
        }


    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Arrays.sort(intArray);
        Integer max = intArray[intArray.length-1];
        return max;
    }
}
