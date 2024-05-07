package HW20;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        String someString = "Hello world";
        System.out.println(reverse(someString));
        System.out.println(vowels(someString));
        System.out.println(palindrome(someString));
        System.out.println();
        System.out.println(stringArray(someString));

    }
    public static String reverse(String someString){
        StringBuilder stringBuilder = new StringBuilder(someString);
        String result = stringBuilder.reverse().toString();
        return result;

    }
    public static int vowels(String someString){
        String[] array = new String[]{"a", "e", "i", "o", "u"};
        int arrayCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if(someString.contains(array[i])){
                arrayCounter++;
            }
        }
        return arrayCounter;
    }
    public static boolean palindrome(String someString){
        //String result = someString.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(someString);
        String result = stringBuilder.reverse().toString();
        if(someString.equals(result)){
            return true;
        } else{
           return false;
        }
    }
    public static void duplicates(String someString){

    }
    public static String stringArray(String someString){
        String[] array = someString.split(" ");
        String result = Arrays.toString(array);
        return result;
    }
}
