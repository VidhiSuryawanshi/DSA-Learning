import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a=input.nextInt();
        System.out.print("Enter Second number : ");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("Sum of them = "+sum);
    }
}