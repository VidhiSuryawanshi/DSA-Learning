import java.util.Scanner;

public class PerimeterCalculation {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        while ((true)) {
        PerimeterCircle(input);
        PerimeterEquilateralTriangle(input);
        PerimeterParallalogram(input);
        PerimeterReactangle(input);
        PerimeterSquare(input);
        PerimeterRhombus(input);
        }
            
    }
    
    static void PerimeterCircle(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The Radius of the Circle : ");
        float r = input.nextFloat();
    
        perimeter = 2*3.14*r;
        System.out.printf("The Perimeter of the Circle is : %.2f",perimeter);
    
    }
    
    
    static void PerimeterEquilateralTriangle(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The Side of the Equilateral Triangle : ");
        float side = input.nextFloat();
    
        perimeter = 3*side;
        System.out.printf("The Perimeter of the Equilateral Triangle is : %.2f",perimeter);
    
    }
    
    
    
    static void PerimeterParallalogram(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The base of the Parallalogram : ");
        float base = input.nextFloat();
    
        System.out.print("Enter The Side of the Parallalogram : ");
        float side = input.nextFloat();
    
        perimeter = 2*(base+side);
        System.out.printf("The Perimeter of the Parallalogram is : %.2f",perimeter);
    
    }
    
    
    
    static void PerimeterReactangle(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The length of the Reactangle : ");
        float length = input.nextFloat();
    
        System.out.print("Enter The width of the Reactangle : ");
        float width = input.nextFloat();
    
        perimeter = 2*(length+width);
        System.out.printf("The Perimeter of the Reactangle is : %.2f",perimeter);
    
        }
    
    
    
    static void PerimeterSquare(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The Side of the Square : ");
        float side = input.nextFloat();
    
        perimeter = 4*side;
        System.out.printf("The Perimeter of the Square is : %.2f",perimeter);
            
        }
    
    
    static void PerimeterRhombus(Scanner input){
        double perimeter;
    
        System.out.print("\n\nEnter The Side of the Rhombus : ");
        float side = input.nextFloat();
    
        perimeter = 4*side;
        System.out.printf("The Perimeter of the Rhombus is : %.2f",perimeter);
            
        }
    
    
    }