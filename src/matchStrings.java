/*
https://edabit.com/challenge/D6Lcut2s2gEzdCPvv
Write a function that validates whether
two strings are identical. Make it case insensitive.

Examples
match("hello", "hELLo") ➞ true
match("motive", "emotive") ➞ false
match("venom", "VENOM") ➞ true
match("mask", "mAskinG") ➞ false
*/

public class matchStrings {
    public static void main(String[] args) {
        System.out.println(match("hello", "hELLo"));
    }

    public static boolean match(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}
