package hackerank_30daysofcode;

public class Day3_IntroToConditionalStatements {

    public static void main(String[] args) {
            int N = 3;
            //if n is odd, print "weird"
            //if n is even && inclusive range of 6 to 20, print "weird"

            //if n is even && inclusive range of 2 to 5, print "Not Weird"
            //if n is even && greater than 20, print "Not Weird"

            if ((N % 2 != 0) || (N % 2 == 0 && N >= 6 && N <= 20)) {
                System.out.println("Weird");

            } else if (N % 2 == 0 && N >= 2 && N <= 5 || N > 20) {
                System.out.println("Not Weird");
            }


           // bufferedReader.close();

    }
}
