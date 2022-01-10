/*
Two Makes Ten
https://edabit.com/challenge/Nz6AzC4v8jyMCH2Tu
Create a function that takes two arguments. Both arguments are integers, a and b.
Return true if one of them is 10 or if their sum is 10.
examples:
makesTen(9, 10) ➞ true
makesTen(9, 9) ➞ false
makesTen(1, 9) ➞ true

 */

public class TwoMakesTen {
    public static void main(String[] args) {
        System.out.println(twoMakesTen(1,9));
    }

    public static boolean twoMakesTen(int a, int b) {

        return a + b == 10 || a == 10 ||  b == 10;
    }


}
