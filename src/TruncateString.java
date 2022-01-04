/*
  FreeCodeCamp converted the below from JavaScript into Java
    Truncate a string (first argument) if it is longer than the given
    maximum string length (second argument). Return the truncated string with a ... ending.

function truncateString(str, num) {

  if (str.length > num) {
    str = str.substring(0, num) + "...";
  }
  return str;
}

truncateString("A-tisket a-tasket A green and yellow basket", 8);

 */

public class TruncateString {

    public static void main(String[] args) {
        System.out.println("test: " + truncateString("A-tisket a-tasket A green and yellow basket", 8));
    }

    public static String truncateString(String str, int num) {
        if (str.length() > num) {
            str = str.substring(0, num) + "...";
        }
        return str;
    }
}
