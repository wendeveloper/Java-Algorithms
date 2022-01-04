/*
  FreeCodeCamp converted the below from JavaScript into Java
  converted this from javascript to java
  Check if a string (first argument, str) ends with the given target string (second argument, target).

  This challenge can be solved with the .endsWith() method, which was introduced in ES2015.
  But for the purpose of this challenge, we would like you to use one of the JavaScript substring methods instead.

    function confirmEnding(str, target) {
        let strLength = str.length;
        let targetLength = target.length;

        if (str.substring(strLength - targetLength) === target){
            str = true;
        } else{
            str = false;
        }

        return str;
    }

    confirmEnding("Bastian", "n");


   */


import java.util.Arrays;

public class ConfirmTheEnding {

    public static void main(String[] str) {
        System.out.println("Does string end with given target? " + confirmEnding("Boston", "on"));
    }

    public static String confirmEnding(String str, String target) {

        int strLength = str.length();
        int targetLength = target.length();
        if (str.substring(strLength - targetLength).equals(target)) {
            str = "true";
        } else{
            str = "false";
        }
        return str;
    }

}