package edabit;
/*
edabit
https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
How Much is True?
Create a function which returns the number of true values there are in an array.

Examples
countTrue([true, false, false, true, false]) ➞ 2

countTrue([false, false, false, false]) ➞ 0

countTrue([]) ➞ 0
Notes
Return 0 if given an empty array.
All array items are of the type bool (true or false).
 */
public class CountTrue {

    public static void main(String[] args) {
        boolean[] arr = {false, false, false, false};
        System.out.println(countTrue(arr));
    }


    public static int countTrue(boolean[] arr) {
        int countTrue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true) {
                countTrue++;
            };
        }
        return countTrue;
    }

}
