import java.util.*;

import static java.util.stream.Collectors.joining;

class Array2D_HourglassSum {
    public static void main(String[] args) {

//        System.out.println(hourglassSum(new int[][] arr = new int{
//                {1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}
//        }));
    }

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {



        // Write your code here
        //int sumMaxHourglass = -63;
        int sumMaxHourglass =
        (
                    arr.get(0).get(0) +
                        arr.get(0).get(1) +
                        arr.get(0).get(2) +
                        arr.get(1).get(1) +
                        arr.get(2).get(0) +
                        arr.get(2).get(1) +
                        arr.get(2).get(2)
        );


        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = 0; j < arr.get(i).size()-2; j++) {
                //int sumHourglass = (
                int sumTempHourglass = (
                                arr.get(i).get(j) +
                                arr.get(i).get(j+1) +
                                arr.get(i).get(j+2) +
                                arr.get(i+1).get(j+1) +
                                arr.get(i+2).get(j) +
                                arr.get(i+2).get(j+1) +
                                arr.get(i+2).get(j+2)
                );
                //sumMaxHourglass = Math.max(sumMaxHourglass, sumHourglass);
                if (sumTempHourglass > sumMaxHourglass) {
                    sumMaxHourglass = sumTempHourglass;
                }
            }
        }
        return sumMaxHourglass;
    }





}





