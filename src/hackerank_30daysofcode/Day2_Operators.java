package hackerank_30daysofcode;

public class Day2_Operators {

    public static void main(String[] args) {

        //hardcode for testing
        solve(100,15,8);
    }

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // Write your code here
        double doubleTipPercent = tip_percent;
        double doubleTaxPercent = tax_percent;
        double totalTip = meal_cost * (doubleTipPercent/100);
        double totalTax = meal_cost * (doubleTaxPercent/100);
        double totalMealCost = meal_cost + totalTip + totalTax;

        System.out.print(Math.round(totalMealCost));

    }

}
