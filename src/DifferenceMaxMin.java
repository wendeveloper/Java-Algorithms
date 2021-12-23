import java.util.Arrays;

public class DifferenceMaxMin {

    public static void main(String[] args) {
        System.out.println("test " + differenceMaxMin(new int[] {1,2,3,4,50}));
    }

    //Create a function that takes an array and returns
    // the difference between the biggest and smallest numbers.
    public static int differenceMaxMin(int[] arr) {

        //
        //Arrays.sort(arr);  //assigns array to sorted array
        //return arr[arr.length-1] - arr[0];

        //for loop version
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;

    }

}
