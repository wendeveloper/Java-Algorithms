public class CountdownRecursive {

    public static void main(String[] args) {

        countdownRecursive(5);
    }

    public static void countdownRecursive(int num) {

        if (num != 0) {
            System.out.println(num);
            countdownRecursive(num - 1);
        }

//        if (num == 0 ) {
//            return;
//        }
//        System.out.println(num);
//        countdownRecursive(num - 1);

    }

}
