import java.util.Scanner;

public class SumByOwnMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two integers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            Sum(a, b);
            Subtraction(a, b);
            Product(a,b);
        }
    }

    static void Sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    static void Subtraction(int a, int b) {
        if (a > b) {
            int difference = a - b;
            System.out.println("The difference is " + difference);
        } else {
            int difference = b - a;
            System.out.println("The difference is " + difference);
        }
    }

    static void Product(int a, int b) {
        int Product = a * b;
        System.out.println("The Product is " + Product);
    }
}
