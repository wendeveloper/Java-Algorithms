public class SumOfAllDigits {
// https://www.youtube.com/watch?v=ZQElfZSfbZc
    public static void main(String[] args) {

        System.out.println(sumOfDigits(11111));

    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {    // run while number is > 0
            int lastDigit = number % 10;   // modulo 10 will give remainder, which will be the last digit
            sum += lastDigit;
            number /= 10;  // each time this runs, number gets reduced by a digit
        }
        return sum;  // returns sum of digits
    }
}
