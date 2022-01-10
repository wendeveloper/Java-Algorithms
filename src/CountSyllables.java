/*
Count Syllables
https://edabit.com/challenge/RPBqWjEa7iyo9p54F
Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.

Examples
numberSyllables("buf-fet") ➞ 2
numberSyllables("beau-ti-ful") ➞ 3
numberSyllables("mon-u-men-tal") ➞ 4
numberSyllables("on-o-mat-o-poe-ia") ➞ 6
 */

public class CountSyllables {
    public static void main(String[] args) {
        System.out.println("number of syllables: " + numberSyllables("beau-ti-ful"));
    }

    public static int numberSyllables(String word) {

        return word.split("-").length;
    }
}
