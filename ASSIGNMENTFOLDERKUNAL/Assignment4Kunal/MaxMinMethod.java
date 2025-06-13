import java.util.Scanner;

public class MaxMinMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter three integers:");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            Max(a, b, c);
            Min(a, b, c);
        }
    }

    static void Max(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.printf("a = %d is Maximum\n", a);
        } else if (b >= a && b >= c) {
            System.out.printf("b = %d is Maximum\n", b);
        } else {
            System.out.printf("c = %d is Maximum\n", c);
        }
    }

    static void Min(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.printf("a = %d is Minimum\n", a);
        } else if (b <= a && b <= c) {
            System.out.printf("b = %d is Minimum\n", b);
        } else {
            System.out.printf("c = %d is Minimum\n", c);
        }
    }
}
