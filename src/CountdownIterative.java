public class CountdownIterative {
    public static void main(String[] args) {

        countdownInterative(5);
    }

    public static void countdownInterative(int number) {
        int countdown = 0;
        for(int i = number; i > 0; i--) {
            System.out.println(i);
        }


    }
}
