/*
https://edabit.com/challenge/qKQ8Bn6ontrLTTNsr

javascript
function addNums(nums) {
	//convert String nums to array
	let arrStrNums = nums.split(",");

	//convert String array to array of integers
	let arrIntNums = arrStrNums.map((i) => Number(i));

	let sumNums = 0;
  for (let i = 0; i < arrIntNums.length; i++) {
      sumNums += arrIntNums[i];
  }

  return sumNums;
}

Given a string of numbers separated by a comma and space,
return the total sum of all the numbers.

Examples
addNums("2, 5, 1, 8, 4") ➞ 20
addNums("1, 2, 3, 4, 5, 6, 7") ➞ 28
addNums("10") ➞ 10
Notes:
Numbers will always be separated by a comma and space.
Your function should accept negative numbers.
*/

/*
            The valueOf method returns the relevant Number Object
            holding the value of the argument passed. The argument
            can be a primitive data type, String, etc.
            https://www.tutorialspoint.com/java/number_valueof.htm
   */



import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class AddingNumbersInAString {
    public static void main(String[] args) {
        System.out.println(addNums("1, 2, 3, 4, 5, 6, 7"));
    }

    public static <let> int addNums(String nums) {

        //convert String nums to array
        String[] arrStrNums = nums.split(",");

        int sumOfNums = 0;
        for (int i = 0; i < arrStrNums.length; i++) {

            //convert the string to integer.  Trim the leading space
            sumOfNums += Integer.valueOf(arrStrNums[i].trim());
        }

        return sumOfNums;

    }

}
