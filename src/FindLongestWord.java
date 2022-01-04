/*
FreeCodeCamp converted the below from JavaScript into Java
  Return the length of the longest word in the provided sentence.
  Your response should be a number.

function findLongestWordLength(str) {

  let arrStr = str.split(" ");
  let longestWordLength = 0;

  for(let i = 0; i < arrStr.length; i++){
    if(arrStr[i].length > longestWordLength) {
      longestWordLength = arrStr[i].length;
    };
  }

  return longestWordLength;
}

findLongestWordLength("The quick brown fox jumped over the lazy dog");
 */

public class FindLongestWord {

    public static void main(String[] args) {
        System.out.println("longest word length: " + findLongestWordLength("The quick brown fox jumped over the lazy dog"));
    }


    public static String findLongestWordLength(String str) {
        String[] strArray = str.split(" ");  //split the string at each space to create array of words
        int lengthOfLongestWord = 0;

        for (int i = 0; i < strArray.length; i++){  //loop through array of words
            if ( strArray[i].length() > lengthOfLongestWord ) {   //compare length of word in array
                lengthOfLongestWord = strArray[i].length();
            }
        }

        return Integer.toString(lengthOfLongestWord); //built in Java method to convert and return a String
    }

}
