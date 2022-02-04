package hackerank_30daysofcode;

public class Day9_Recursion3 {

        //Complete the factorial function in the editor below. Be sure to use recursion.
        public static void main(String[] args) {

            System.out.println(factorial(3));
        }
        public static int factorial(int n) {
            if (n <= 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }

            //return (n == 1) ? 1 : n*factorial(n-1);
        }

    }
