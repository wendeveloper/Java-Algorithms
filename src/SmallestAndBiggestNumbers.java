// Create a function that takes an array of numbers and return both
// the minimum and maximum numbers, in that order.

// All test arrays will have at least one element and are valid.


import java.util.Arrays;

public class SmallestAndBiggestNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new double[]{1, 2, 3, 4, 5})));
    }
    // minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
    public static double[] minMax(double[] arr) {
        // max number
        double maxNumber = arr[0];
        // min number
        double minNumber = arr[0];

        for(int i = 0; i < arr.length; i++) {

            // find the largest and save in max number var
            if(arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            // find the smallest and save in min number var
            if (arr[i] < maxNumber && arr[i] < minNumber){
                minNumber = arr[i];
            }

        } //end for loop
        return new double[] {minNumber, maxNumber};

    }
}



/*
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]

minMax([2334454, 5]) ➞ [5, 2334454]

minMax([1]) ➞ [1, 1]


*/
