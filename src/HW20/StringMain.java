package HW20;

import java.util.*;

public class StringMain {
    public static void main(String[] args) {
        String someString = "Hello world";
        System.out.println(reverse(someString));
        System.out.println(vowels(someString));
        System.out.println(palindrome(someString));
        System.out.println(duplicates(someString));
        System.out.println(stringArray(someString));

    }
    public static String reverse(String someString){
        StringBuilder stringBuilder = new StringBuilder(someString);
        String result = stringBuilder.reverse().toString();
        return result;

    }
    public static int vowels(String someString){
        String[] array = new String[]{"a", "e", "i", "o", "u"};
        int vowelsCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if(someString.contains(array[i])){
                vowelsCounter++;
            }
        }
        return vowelsCounter;
    }
    public static String palindrome(String someString){
        StringBuilder stringBuilder = new StringBuilder(someString);
        String result = stringBuilder.reverse().toString();
        if(someString.equals(result)){
            return "Так, "+ someString + " є паліндромом";
        } else{
           return "Ні, "+ someString + " не є паліндромом";
        }
    }
    public static String duplicates(String someString){
        StringBuilder newString = new StringBuilder();
        int n = someString.length();

        for (int i = 0; i < n; i++) {
            if (newString.indexOf(String.valueOf(someString.charAt(i))) == -1) {
                newString.append(someString.charAt(i));
            }
        }

        return newString.toString();
    }
    public static String stringArray(String someString){
        String[] array = someString.split(" ");
        String result = Arrays.toString(array);
        return result;
    }
}
