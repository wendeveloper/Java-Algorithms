import java.util.Arrays;

public class SortNumbersAscending {
//Sort Numbers
//https://edabit.com/challenge/WM5s7vuHnXdcKCEjS

    public static void main(String[] args) {
        int[] arr = {10000,20,3,400,5};
        arr = sortNumsAscending(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Create a method that takes an array of integers and returns a new array,
    // sorted in ascending order (smallest to biggest).
    public static int[] sortNumsAscending(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

