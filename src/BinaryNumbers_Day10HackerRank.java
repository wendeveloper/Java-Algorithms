/*
Task
Given a base- integer, , convert it to binary (base-).
Then find and print the base- integer denoting the maximum number of
consecutive 's in 's binary representation. When working with different bases,
it is common to show the base as a subscript.

Example:
The binary representation of  is . In base , there are  and
consecutive ones in two groups. Print the maximum, .
 */
public class BinaryNumbers_Day10HackerRank {

    public static void main(String[] args) {
        System.out.println(convertToBinary(13));
    }
    public static int convertToBinary(int n) {

        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
            if(tmpCount > maxCount){
                maxCount = tmpCount;
            }
        }
        return(maxCount);

    }

}
