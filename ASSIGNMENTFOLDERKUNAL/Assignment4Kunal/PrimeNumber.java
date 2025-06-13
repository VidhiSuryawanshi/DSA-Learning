import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter any integer: ");
            int a = input.nextInt();
            PrimeNumberCheck(a);
        }
    }

    static void PrimeNumberCheck(int a) {
        if (a <= 1) {
            System.out.println("The number isn't prime.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("The number isn't prime.");
                return;
            }
        }
        System.out.println("The number is prime.");
    }
}
