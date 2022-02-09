package edabit;
/*
Write a function that recursively finds the sum of the first n natural numbers.

Examples
sum(5) ➞ 15
// 1 + 2 + 3 + 4 + 5 = 15

sum(1) ➞ 1

sum(12) ➞ 78
Notes
Assume the input number is always positive.
Check the Resources tab for info on recursion.
 */
public class RecursionSum {

    public static void main(String[] args) {

        System.out.println(recursionSum(5));
    }

    public static int recursionSum(int num) {

        if (num >= 1) {
            return (recursionSum(num - 1) + num);
        }
        return num;
    }
}
