public class ReverseTheNumber {

    public static void main(String[] args) {
        System.out.println(reverseTheNumber(1234));
    }


    public static int reverseTheNumber(int n) {
        int reverse = 0;
        // run loop until num becomes 0
        while (n != 0) {

            reverse = reverse * 10 + n % 10;

            // remove the last digit from num
            n /= 10;
        }
        return n;
    }
}
