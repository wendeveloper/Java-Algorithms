public class AlternatingCharacters {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AABAAB"));
    }

    /*
    You are given a string containing characters  and  only.
    Your task is to change it into a string such that there are no matching
    adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

    Your task is to find the minimum number of required deletions.

    Example: "AABAAB" returns 2

     */
    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        char[] arrS = s.toCharArray();  // this converts the s String to an array


        for (int i = 1; i < arrS.length; i++) {
            if (arrS[i] == arrS[i-1]){
                count++;
            }
        }
        return count;


        //or
//        int minDeletions = 0;
//        for (int i = 0; i<s.length()-1; i++){
//            if(s.charAt(i) == s.charAt((i+1)){
//                minDeletions++;
//            }
//        }

    }
}
