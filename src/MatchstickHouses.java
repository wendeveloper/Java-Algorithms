// Create a function that takes a number (step)
// as an argument and returns the number of matchsticks in that step.


/*
Step 0 returns 0 matchsticks.
The input (step) will always be a non-negative integer.
Think of the input (step) as the total number of houses
that have been connected together.
*/

// matchHouses(1) ➞ 6
// 0 (0)
// 1 (6)
// 1 + 5 = 6 + 5 = 11
	/*house 0 = 0 + 0 (0)
	house 1 = 0 + 6 (6)
	house 2 = 6 + 5 (11)
	house 3 = 11 + 5 (16)
	house 4 = 16 + 5 (21)	*/
// step = the house
public class MatchstickHouses {
    public static void main(String[] args) {
        System.out.println(matchHouses(87));
    }


    public static int matchHouses(int step) {
        if(step != 0){
            return (step * 5) + 1;
        }
        return 0;
    }


}
