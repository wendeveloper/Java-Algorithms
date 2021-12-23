import java.util.Arrays;

public class DifferenceMaxMin {

    public static void main(String[] args) {
        System.out.println("test " + differenceMaxMin(new int[] {1,2,3,4,50}));
    }

    //Create a function that takes an array and returns
    // the difference between the biggest and smallest numbers.
    public static int differenceMaxMin(int[] arr) {

        //
        Arrays.sort(arr);  //assigns array to sorted array
        return arr[arr.length-1] - arr[0];

    }

}
