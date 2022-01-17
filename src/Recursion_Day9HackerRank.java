public class Recursion_Day9HackerRank {

    //Complete the factorial function in the editor below. Be sure to use recursion.
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int n) {
        return (n == 1) ? 1 : n*factorial(n-1);
    }

}
