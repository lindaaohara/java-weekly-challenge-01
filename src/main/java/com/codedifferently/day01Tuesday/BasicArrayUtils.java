package com.codedifferently.day01Tuesday;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] reverse = new String[stringArray.length];
        int counter = 0;
        for(int index =stringArray.length-1; index >= 0; index--){
            reverse[counter] = stringArray[index];
            counter++;

           // System.out.println ("index: " + index);
           // System.out.println("stringArray[" + index + "]: " + stringArray[index]);
        }
        return reverse;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String firstLetter="";
        for(int index=0; index < stringArray.length; index++){
         firstLetter += stringArray[index].charAt(0) + "";
         // firstLetter = firstLetter + stringArray[index].charAt(0) + "";
        }
        return firstLetter;
    }
}
