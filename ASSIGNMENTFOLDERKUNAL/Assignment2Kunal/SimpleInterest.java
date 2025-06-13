import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Principal:");
        double principal=input.nextDouble();

        System.out.print("Enter the Time(in year):");
        double time=input.nextDouble();

        System.out.print("Enter the Rate(as a percentage):");
        double rate=input.nextDouble();

        double simpleInterest= (principal*rate*time)/100;
        System.out.println("Your Simple Interest is : "+ simpleInterest);

    }
    
}
