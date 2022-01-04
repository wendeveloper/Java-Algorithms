/*

Create a function that returns true when x is equal to y; otherwise return false.
https://edabit.com/challenge/5gpukjfi5rAH8MvKF
 */


public class AreNumbersEqual {
    public static void main(String[] args) {
        System.out.println(areNumbersEqual(4,4));
    }

    public static Boolean areNumbersEqual(int num1, int num2) {
        Boolean isSameNum = false;
        if (num1 == num2) {
            isSameNum = true;
        }
        return isSameNum;
    }


}
