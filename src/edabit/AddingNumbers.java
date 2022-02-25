package edabit;
/*
https://edabit.com/challenge/vFLhYANAZQGKTtxA2
Create a function that takes two number strings and returns their sum as a string.

Examples
add("111", "111") ➞ "222"

add("10", "80") ➞ "90"

add("", "20") ➞ "Invalid Operation"
Notes
Return "Invalid Operation" If either input is "" or null.

 */
public class AddingNumbers {

    public static void main(String[] args) {
        System.out.println(add("", "20"));
    }

    public static String add(String a, String b) {

       if (a == "" || a == null || b == "" || b == null) {
           return "Invalid Operation";
       } else {
           int sum = Integer.parseInt(a) + Integer.parseInt(b);
           String strSum = String.valueOf(sum);
           return strSum;
       }
    }

}
