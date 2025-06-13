import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("\n\nEnter the Radius of the Cylinder : ");
            float r = input.nextFloat();

            System.out.print("Enter the Height of the Cylinder : ");
            float h = input.nextFloat();

            double area = 2*3.14*r*h;
            System.out.printf("The Curved Surface Area of the Cylinder is %.2f ",area);

        }
        

    }
    
}