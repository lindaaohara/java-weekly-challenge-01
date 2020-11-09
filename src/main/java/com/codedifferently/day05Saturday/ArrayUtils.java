package com.codedifferently.day05Saturday;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object num : objectArray) {
            if (num.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //int countOfItemToRemove =getNumberOfOccurrences(objectArray, objectToRemove);
        // Object[] newArray = Arrays.copyOf(objectArray, objectArray.length-countOfItemToRemove);
        ArrayList<Object> newArrayList = new ArrayList<>();
        for (Object element : objectArray) {
            if(element != objectToRemove) {
                newArrayList.add(element);
            }
        //}
        //for (Object element: newArrayList) {
          //  newArrayList.remove(element==objectToRemove);

        }
        return newArrayList.toArray();
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object most= null;
        int numberMost = 0;
        for(int i =0; i< objectArray.length; i++){
            Object temp= objectArray[i];
            int currentCount = getNumberOfOccurrences(objectArray, temp);
            if((numberMost==0) || (currentCount > numberMost)){
                numberMost = currentCount;
                most = temp;
            }
        }

        return most
                ;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object least = null;
        int numberLeast = 0;
        for(int i =0; i< objectArray.length; i++){
            Object temp= objectArray[i];
            int currentCount = getNumberOfOccurrences(objectArray, temp);

            if((numberLeast==0) || (currentCount < numberLeast)){
                numberLeast = currentCount;
                least = temp;
            }
        }
        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        List list = new ArrayList(Arrays.asList(objectArray));
        list.addAll(Arrays.asList(objectArrayToAdd));
        Object[] mergedList = list.toArray();
        return mergedList;
    }
}
