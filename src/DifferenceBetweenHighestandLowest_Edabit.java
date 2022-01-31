//https://edabit.com/challenge/akHQKSkHT26TuA7Ka
/*
The 3 Programmers Problem
You hired three programmers and you (hopefully) pay them.
Create a function that takes three numbers (the hourly wages of each programmer)
and returns the difference between the highest-paid programmer and the lowest-paid.

Examples
programmers(147, 33, 526) ➞ 493
programmers(33, 72, 74) ➞ 41
programmers(1, 5, 9) ➞ 8

Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.
 */
import java.util.Arrays;

public class DifferenceBetweenHighestandLowest_Edabit {
    public static void main(String[] args) {
        System.out.println(programmers(1, 5, 9));
    }

    public static int programmers(int one, int two, int three) {

        //create int array to store the numbers
        int[] arrSalary = new int[]{one, two, three};

        // lowestNum
        Arrays.sort(arrSalary);
        int lowestNum = arrSalary[0];

        // highestNum
        int highestNum = 0;
        for (int i = 0; i < arrSalary.length; i++) {
            //find the highest number
            if (arrSalary[i] > highestNum) {
                highestNum = arrSalary[i];
            }
        }
        return highestNum - lowestNum;
    }
}
