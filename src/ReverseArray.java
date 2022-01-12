public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(reverseArray(new int[] {1,2,3,4,5} ));

    }


    public static String reverseArray(int[] arr) {
        //System.out.println(arr);
        String result = "";
        for(int i = arr.length - 1; i >= 0 ; i--){
            //System.out.println(arr.get(i));
                result += arr[i] + " ";
        }
        return result;
    }
}
