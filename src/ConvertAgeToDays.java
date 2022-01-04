/*

Create a function that takes the age in years and returns the age in days.
https://edabit.com/challenge/eqcCH2WbEXFLDyiQi
 */


public class ConvertAgeToDays {
    public static void main(String[] args) {
        System.out.println(convertAgeToDays(20));
    }
    public static int convertAgeToDays(int age){
        int ageInYears = age * 365;
        return ageInYears;
    }
}
