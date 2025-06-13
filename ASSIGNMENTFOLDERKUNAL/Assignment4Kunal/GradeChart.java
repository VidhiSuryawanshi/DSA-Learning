import java.util.Scanner;

public class GradeChart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            Grade(input);
        }
    }

    static void Grade(Scanner input) {
        System.out.print("Enter your grade out of 100: ");
        int g = input.nextInt();
        
        if (g < 0 || g > 100) {
            System.out.println("Enter a valid choice between 0 to 100");
        } else if (g >= 91) {
            System.out.println("You passed with Grade AA");
        } else if (g >= 81) {
            System.out.println("You passed with Grade AB");
        } else if (g >= 71) {
            System.out.println("You passed with Grade BB");
        } else if (g >= 61) {
            System.out.println("You passed with Grade BC");
        } else if (g >= 51) {
            System.out.println("You passed with Grade CD");
        } else if (g >= 41) {
            System.out.println("You passed with Grade DD");
        } else {
            System.out.println("You failed.");
        }

        System.out.println(); // Add a blank line for better readability
    }
}
