import java.util.Scanner;

public class SumOfFirstNaturalNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Natural Number: ");
        int n = input.nextInt();
        Sum(n);
    }

    static void Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("The Sum of First %d Natural Numbers is %d\n", n, sum);
    }
}
