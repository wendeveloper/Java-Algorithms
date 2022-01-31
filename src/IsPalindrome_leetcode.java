
/*
https://leetcode.com/problems/valid-palindrome/
        A phrase is a palindrome if, after converting all uppercase letters into
        lowercase letters and removing all non-alphanumeric characters, it reads the
        same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.
        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:

        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
*/

public class IsPalindrome_leetcode {

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {

        // step 1- convert all uppercase letters into lowercase letters and
        // step 2- remove all non-alphanumeric characters
        String strLowerCase = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(strLowerCase);

        // step 3 - reverse string
        char[] strArray = strLowerCase.toCharArray();
        String strReversed = "";
        for (int i = strArray.length - 1; i >= 0; i--){
            strReversed += strArray[i];
        }
        System.out.println(strReversed);

        // step 4 - return true if palindrome
        return (strLowerCase.equals(strReversed));

    }
}
