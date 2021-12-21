import java.util.ArrayList;

public class ExistsANumberHigher {

    public static void main(String[] args) {
        System.out.println(existsHigher(new int[] {1,2,3,4,5}, 5));
    }

    //Write a function that returns true
    // if there exists at least one number
    // that is larger than or equal to n.

    int n = 4;

    public static boolean existsHigher(int[] arr, int n) {
            if (arr == null){
                return false;
            }	else {
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] >= n){
                        return true;
                    }
                }
            }
            return false;
        }
    }


