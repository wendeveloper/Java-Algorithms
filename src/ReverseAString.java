/*
FreeCodeCamp converted the below from JavaScript into Java
Reverse the provided string.
You may need to turn the string into an array before you can reverse it.
Your result must be a string.

function reverseString(str) {
let reverseString = "";
for (let i = str.length - 1; i >= 0; i--){
        reverseString += str[i];
    }
return reverseString;
}
reverseString("hello");
 */

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }


    public static String reverseString(String str) {
        char[] strArray = str.toCharArray();
        str = "";
        for (int i = strArray.length - 1; i >= 0; i--){
            str += strArray[i];
        }
        return str;

    }

}
