public class AddUp {
    public static void main(String[] args) {
        System.out.println(addUp(5));
    }

    /*
    Create a method that takes an integer as an argument.
    Add up all the numbers from 1 to the number you passed
    to the function. For example, if the input is 4 then
    your function should return 10 because 1 + 2 + 3 + 4 = 10.
    */
    public static int addUp(int num){
        int sum = 0;
        for ( int i = 1; i <= num; i++ ) {
            sum += i;
        }
        return sum;
    }
}
