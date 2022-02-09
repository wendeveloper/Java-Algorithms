public class CountdownRecursive {

    public static void main(String[] args) {

        countdown(5);
    }

    public static void countdown(int num) {

        if (num != 0) {
            System.out.println(num);
            countdown(num - 1);
        }
    }

}
