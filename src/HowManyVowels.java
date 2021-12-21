public class HowManyVowels {

    public static void main(String[] args) {
        System.out.println(getCount("testing my count"));
    }

    //Create a function that takes a string and returns
    //the number (count) of vowels contained within it.
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                vowelsCount ++;
            }
        }

        return vowelsCount;
    }
}
