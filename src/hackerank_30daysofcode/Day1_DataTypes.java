package hackerank_30daysofcode;


import java.util.Scanner;

public class Day1_DataTypes {

    public static void main(String[] args) {



        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables.*/
//        secondInt = scan.nextInt();
//        secondDouble = scan.nextDouble();
//        scan.nextLine();
//        secondString = scan.nextLine();

        //hardcoded to test
        secondInt = 12;
        secondDouble = 4.0;
        secondString = "is the best place to learn and practice coding!";


        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.print(s + secondString);
        scan.close();
    }
}
