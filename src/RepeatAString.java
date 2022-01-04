/*
  FreeCodeCamp converted the below from JavaScript into Java
  Repeat a given string str (first argument) for num times (second argument).
 Return an empty string if num is not a positive number. For the purpose of this challenge,
 do not use the built-in .repeat() method.

function repeatStringNumTimes(str, num) {
    let newStr = "";
    for (let i = 0; i < num; i++){
      newStr += str;
    }
    str = newStr;
    return str;
}

repeatStringNumTimes("abc", 3);

 */

public class RepeatAString {
    public static void main(String[] args) {
        System.out.println("Repeat this string per num times: " + repeatStringNumTimes("abc", 3));
    }

    public static String repeatStringNumTimes(String str, int num) {
        String newStr = "";
        for (int i = 0; i < num; i++){
            newStr += str;
        }
        str = newStr;
        return str;
    }

}
