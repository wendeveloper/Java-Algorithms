package edabit;

/*
https://edabit.com/challenge/c52kNwPuWo5kp9x4H

Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:

If the length of the string is less than two, return "Incompatible.".
If the first and last characters are the same, return "Two's a pair.".
Examples
flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"

flipEndChars("ada") ➞ "Two's a pair."

flipEndChars("Ada") ➞ "adA"

flipEndChars("z") ➞ "Incompatible."
Notes
Tests are case sensitive (e.g. "A" and "a" are not the same character).
 */

public class FlipEndChars {

    public static void main(String[] args) {

        System.out.println(flipEndChars("Cat, dog, and mouse."));
    }

    public static String flipEndChars(String s) {

        if(s.length() < 2) {
            return "Incompatible";
        } else if (s.charAt(0) == s.charAt(s.length()-1)) {
            return "Two's a pair.";
        } else {
            char lastChar = s.charAt(s.length()-1);  //this grabs the last char
            String middleCharsInString = s.substring(1,s.length()-1);    //this gets the chars
            char firstChar = s.charAt(0);  //this grabs the first char
            String flippedString = lastChar + middleCharsInString + firstChar;
            return flippedString;
        }

    }

}
