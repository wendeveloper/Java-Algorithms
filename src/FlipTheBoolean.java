public class FlipTheBoolean {
    public static void main(String[] args) {
        System.out.println(reverse(true));
    }

    //Create a function that reverses a boolean value.
    public static boolean reverse(boolean b) {
//        if (b == true){
//            b = false;
//        } else{
//            b = true;
//        }
//        return b;
        return !b;
    }
}
