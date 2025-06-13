import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Factorial is not defined for negative integers.");
        } else {
            int factorial = FactorialOfNumber(n);
            System.out.printf("The factorial of %d is %d\n", n, factorial);
        }
        
        input.close(); // Closing the Scanner object
    }

    static int FactorialOfNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
