/*
Create a method that takes a string as its argument and returns the string in reversed order.
https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
 */

public class ReverseOrderOfString {

    public static void main(String[] args) {
        System.out.println(reverseOrderOfString("Hello World!"));
    }
    public static String reverseOrderOfString(String str) {
        char[] strArray = str.toCharArray();
        str = "";
        for (int i = strArray.length - 1; i >= 0; i--){
            str += strArray[i];
        }
        return str;

    }

}




