/*
    FreeCodeCamp converted the below from JavaScript into Java
    Return an array consisting of the largest number from each provided sub-array. For simplicity,
    the provided array will contain exactly 4 sub-arrays.  Remember, you can iterate through an array with a simple for loop,
    and access each member with array syntax arr[i].

    function largestOfFour(arr) {

        let arrLargestNums = [];

        for (let i = 0; i < arr.length; i++) {
            let largestNum = arr[i][0];

            for (let j = 0; j < arr[i].length; j++){
                if(arr[i][j] > largestNum){
                    largestNum = arr[i][j];
                }
            }
            arrLargestNums[i] = largestNum;
        }
        return arrLargestNums;
    }

    largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);

     */


import java.util.Arrays;

public class LargestNumbersInArrays {

    public static void main(String[] args) {
        System.out.println("Array of largest numbers: " + largestOfFour(new int[][] {{4, 5, 1, 3},{13, 27, 18, 26},{32, 35, 37, 39},{1000, 1001, 857, 1}}));
    }

    public static String largestOfFour(int[][] arr) {
        int[] arrLargestNums = new int[4];

        for( int i = 0; i < arr.length; i++){
            int largestNum = arr[i][0];

            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > largestNum) {
                    largestNum = arr[i][j];
                }
            }
            arrLargestNums[i] = largestNum;
        }
        return Arrays.toString(arrLargestNums);
    }

}
