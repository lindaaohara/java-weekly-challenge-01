package com.codedifferently.day02Wednesday;
import java.util.*;


public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder converted = new StringBuilder();
        boolean convertNext = true;
        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar (ch)){
            convertNext = true;
        } else if (convertNext) {
            ch = Character.toTitleCase(ch);
            convertNext = false;
        } else {
            ch = Character.toLowerCase(ch);
        }
        converted.append(ch);
    }
     return converted.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
   /*     StringBuilder builder;
        builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }

    */
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
        reversed = reversed + str.charAt(i);
    }
        return reversed;

    }


    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] splitted = str.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (String word : splitted) {
          String reverseWord = new StringBuilder(word).reverse().toString();
           reverseString.append(reverseWord + " ");
        }
        return reverseString.toString().trim() ;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedString = BasicStringUtils.reverse(str);
        StringBuilder builder;
        builder = new StringBuilder(reversedString);

        boolean convertNext = true;
        StringBuilder stringBuilderWithTitleCase = new StringBuilder();
        char[] stringWithTitleCaseArray = new char[builder.toString().length()];
        builder.getChars(0, builder.toString().length(), stringWithTitleCaseArray, 0 );
        for (char ch : stringWithTitleCaseArray) {
            if (Character.isSpaceChar (ch)){
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            stringBuilderWithTitleCase.append(ch);
        }

        //
        StringBuilder newMethodStringBuilder = new StringBuilder();
      String[] splitArray =   BasicStringUtils.reverse(str).split(" ");
        for(String string : splitArray){
            string = string.substring(0,1).toUpperCase() + string.substring(1);
            newMethodStringBuilder.append(string);
            newMethodStringBuilder.append(" ");
        }
       return  newMethodStringBuilder.toString().trim();

       // return stringBuilderWithTitleCase.toString();
    }



    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder remove = new StringBuilder(str);
        int length = str.length();
        remove.deleteCharAt(length-1);
        remove.deleteCharAt(0);
        return remove.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c))
                chars[i] = Character.toUpperCase(c);
        }

        return new String(chars);
    }
}
