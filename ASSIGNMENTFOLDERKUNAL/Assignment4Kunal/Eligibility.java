import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your Age: ");
            int a = input.nextInt();
            EligibilityCheck(a);
        }
    }

    static void EligibilityCheck(int a) {
        if (a >= 18) {
            System.out.println("You Are Eligible for Voting");
        } else {
            System.out.println("You Are not Eligible for Voting");
        }
    }
}
