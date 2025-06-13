import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First numbers: ");
        int a=input.nextInt();

        System.out.print("Enter Second numbers: ");
        int b=input.nextInt();

        if(a>b){
            System.out.println(a+" is Larger than "+b);
        }
        else if(b>a){
            System.out.println(b+" is Larger than "+a);
        }
        else {
            System.out.println(a+" is Equal to "+b);
        }
        input.close();
    }
}