package edabit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/*
https://edabit.com/challenge/kgMghy3omychqLnXv

Given an array of integers, write a method that returns an array that...

Has all duplicate elements removed.
Is sorted from least value to greatest value.
Examples
uniqueSort([1, 2, 4, 3]) ➞ [1, 2, 3, 4]

uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]) ➞ [1, 2, 3, 4]

uniqueSort([6, 7, 3, 2, 1]) ➞ [1, 2, 3, 6, 7]
 */
public class UniqueSort {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 2, 5, 3, 5};
        uniqueSort(nums);

    }

    public static int[] uniqueSort(int[] nums) {

        Arrays.sort(nums);   //sorts the array with duplicates

        Arrays.stream(nums).distinct().toArray();

        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        int count = nums.length;
        int[] uniqueNums = new int[count];
        nums[j] = nums[nums.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.println(nums[i]);
            uniqueNums[i] = nums[i];
            count++;
        }
        return uniqueNums;
    }
}
