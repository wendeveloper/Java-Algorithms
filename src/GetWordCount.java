public class GetWordCount {

    public static void main(String[] args) {
        System.out.println(countWords("Count these words."));
    }

    //Create a method that takes a string and returns the word
    //count. The string will be a sentence.

    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++){
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                count++;
            }

        }
        return count;
    }

}
