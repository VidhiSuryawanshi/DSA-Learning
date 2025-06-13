import java.util.Scanner;

public class CircleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter the radius of the circle: ");
            int r = input.nextInt();
            Circumference(r);
            Area(r);
        }
    }

    static void Circumference(int r) {
        double circumference = 2 * Math.PI * r;
        System.out.printf("\nThe circumference of the circle is %.2f\n", circumference);
    }

    static void Area(int r) {
        double area = Math.PI * r * r;
        System.out.printf("\nThe area of the circle is %.2f\n", area);
    }
}
