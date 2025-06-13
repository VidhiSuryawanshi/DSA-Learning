import java.util.Scanner;

public class VolumeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        ConeVolume(input);
        PrismVolume(input);
        CylinderVolume(input);
        SphereVolume(input);
        PyramidVolume(input);
        }

    }

    static void ConeVolume(Scanner input){
        double volume;

        System.out.print("\n\nEnter the Radius of the cone : ");
        float r = input.nextFloat();

        System.out.print("Enter the Height of the cone : ");
        float h = input.nextFloat();


        volume = 0.33*3.14*r*r*h;
        System.out.printf("The volume o the is %.2f ",volume);
    }


    static void PrismVolume(Scanner input){
        double volume;

        System.out.print("\n\nEnter the BaseArea of the Prism : ");
        float BaseArea = input.nextFloat();

        System.out.print("Enter the Height of the Prism : ");
        float height = input.nextFloat();

        volume=BaseArea*height;
        System.out.printf("The volume o the is %.2f",volume);
    }


    static void CylinderVolume(Scanner input){
        double volume;

        System.out.print("\n\nEnter the Radius of the Cylinder : ");
        float r = input.nextFloat();

        System.out.print("Enter the Height of the Cylinder : ");
        float h = input.nextFloat();

        volume=3.14*r*r*h;
        System.out.printf("The volume of Cylinder is %.2f",volume);
    }


    static void SphereVolume(Scanner input){
        double volume;

        System.out.print("\n\nEnter the Radius of the Sphere : ");
        float r = input.nextFloat();

        volume=1.33*3.14*r*r*r;
        System.out.printf("The volume of Sphere is %.2f",volume);
    }


    static void PyramidVolume(Scanner input){
        double volume;

        
        System.out.print("\n\nEnter the BaseArea of the Pyramid : ");
        float BaseArea = input.nextFloat();

        System.out.print("Enter the Height of the Pyramid : ");
        float height = input.nextFloat();


        volume = .33*BaseArea*height;
        System.out.printf("The volume of  Pyramid is %.2f",volume);
    }



}