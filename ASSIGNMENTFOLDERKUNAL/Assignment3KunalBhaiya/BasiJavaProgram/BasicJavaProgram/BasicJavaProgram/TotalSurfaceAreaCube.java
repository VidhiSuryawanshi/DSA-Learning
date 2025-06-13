import java.util.Scanner;

public class TotalSurfaceAreaCube {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        while (true) {
            double area ;

            System.out.print("\n\nEnter the length of the cube : ");
            float a = input.nextFloat();

            area = 6*a*a;
            System.out.printf("The Total Surface Area of Cube is %.2f",area);

        }
    }
}