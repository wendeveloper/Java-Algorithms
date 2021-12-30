public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    /*
Reverse the provided string.

You may need to turn the string into an array before you can reverse it.

Your result must be a string.
     */

    public static String reverseString(String str) {
        char[] strArray = str.toCharArray();
        str = "";
        for (int i = strArray.length - 1; i >= 0; i--){
            str += strArray[i];
        }
        return str;

    }

}
