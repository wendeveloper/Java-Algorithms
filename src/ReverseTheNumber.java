public class ReverseTheNumber {

    public static void main(String[] args) {
        System.out.println(reverseTheNumber(1234));
    }

    //creating function takes in a number and reverses it
    public static String reverseTheNumber(int n) {
        String nString = Integer.toString(n);
        String result = "";     //"4" "43" "432" "4321"

        //-1234, "4321-" '4321-
        for( int i = nString.length()-1; i >= 0; i--){
            result += String.valueOf(nString.charAt(i));   //convert character to string value and append to result
        }

        if (n < 0){
            // "4321-"  cut out everything up to minus sign, which is last character
            return result.substring(0, result.length()-1);  // (starting, end)
        }
        return result;

    }
}
