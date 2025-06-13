import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
        CircleArea( input );
        TriangleArea( input );
        ReactangleArea( input );
        ParallelogramArea( input );
        IsoscalusTriangleArea( input );
        EquilateratTriangleArea( input );
        RhombusArea( input );
        break;
        }
    }



    static void CircleArea(Scanner input){
    double area;
    System.out.print("\n\nEnter the Radius of the Circle : ");
    float radius = input.nextFloat();

    area =  3.14*radius*radius;
    System.out.printf("The Area of the Circle is %.2f : ",area);

   }


   static void TriangleArea(Scanner input){
    //Base Height Formula 
    double area;
    System.out.print("\n\nEnter the Base of the triangle:");
    float Base = input.nextFloat();

    System.out.print("Enter the Height of the triangle:");
    float Height = input.nextFloat();

    area= 0.5*Base*Height;
    System.out.printf("The Area of the Triangle is %.2f : ",area);    
   }



   static void ReactangleArea(Scanner input){
    double area;
    System.out.print("\n\nEnter the length of the Reactangle:");
    float length = input.nextFloat();

    System.out.print("Enter the breadth of the Reactangle:");
    float breadth = input.nextFloat();

    area= length*breadth;
    System.out.printf("The Area of the Triangle is %.2f : ",area);
    }



   static void ParallelogramArea( Scanner input ){
    double area;
    System.out.print("\n\nEnter the Base of the Parallelogram:");
    float Base = input.nextFloat();

    System.out.print("Enter the Height of the Parallelogram:");
    float Height = input.nextFloat();

    area= Base*Height;
    System.out.printf("The Area of the Parallelogram is %.2f :  ",area);
   }


   static void IsoscalusTriangleArea( Scanner input ){
    double area;
    System.out.print("\n\nEnter the Base of the Isoscalus Triangle:");
    float Base = input.nextFloat();

    System.out.print("Enter the Height of the Isoscalus Triangle:");
    float Height = input.nextFloat();

    area= (Base*Height)/2;
    System.out.printf("The Area of the Isoscalus Triangle is %.2f : ",area);
    }

   
   static void EquilateratTriangleArea(  Scanner input ){
    double area;
    System.out.print("\n\nEnter the side of lenght of Equilaterat Triangle");
    float side = input.nextFloat();

    area=0.433*side*side;
    System.out.printf("The Area of the Equilaterat Triangle is %.2f :",area);
   }


   static void RhombusArea( Scanner input ){
    double area;
    System.out.print("\n\nEnter the side of lenght of Rhombus Triangle : ");
    float side = input.nextFloat();

    System.out.print("Enter the Height of Rhombus Triangle : ");
    float Height = input.nextFloat();

    area=side*Height;
    System.out.printf("The Area of the Rhombus  Triangle is %.2f :",area);

   }

}