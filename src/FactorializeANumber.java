
/*
FreeCodeCamp converted the below from JavaScript into Java
Return the factorial of the provided integer.
If the integer is represented with the letter n, a factorial is the product of all positive integers less than or equal to n.
Factorials are often represented with the shorthand notation n!
For example: 5! = 1 * 2 * 3 * 4 * 5 = 120
Only integers greater than or equal to zero will be supplied to the function.
javascript
function factorialize(num) {
    let result = 1;
    for (let i = 1; i <= num; i++){
        result *= i;
    }
    return result;
}
factorialize(5);
 */
public class FactorializeANumber {

    public static void main(String[] args) {
        System.out.println("factorial of the provided integer: " + factorialize(5));
    }

    public static int factorialize(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }

        return result;
    }
}
