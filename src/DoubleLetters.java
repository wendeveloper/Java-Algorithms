public class DoubleLetters {
//Double Letters
//https://edabit.com/challenge/EaWY5d2pYBckrkAnS

    public static void main(String[] args) {

        System.out.println("this word has two consecutive identical letters? " + doubleLetters("loop"));
    }

    // Create a function that takes a word and returns true
    // if the word has two consecutive identical letters.
    public static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length()-1; i++){
            //"loop"
            if ( word.charAt(i) == word.charAt(i+1)) {

                return true;
            }
        }
        return false;
    }

}
