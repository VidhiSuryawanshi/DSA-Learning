import java.util.Scanner;

public class PythagorasTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEnter three numbers:");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (isPythagorasTriplet(a, b, c) || isPythagorasTriplet(b, c, a) || isPythagorasTriplet(c, a, b)) {
                System.out.println("It's a Pythagorean Triplet");
            } else {
                System.out.println("It's not a Pythagorean Triplet");
            }
        }
    }

    public static boolean isPythagorasTriplet(int x, int y, int z) {
        return x * x + y * y == z * z;
    }
}
