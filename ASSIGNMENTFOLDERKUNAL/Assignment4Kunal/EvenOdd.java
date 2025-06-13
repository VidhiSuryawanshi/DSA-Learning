import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter any Integer: ");
            int a = input.nextInt();
            EvenOddCheck(a);
        }
    }

    static void EvenOddCheck(int a) {
        if (a % 2 == 0) {
            System.out.printf("a = %d is Even\n", a);
        } else {
            System.out.printf("a = %d is Odd\n", a);
        }
    }
}
