import java.util.Scanner;

public class AdditionOfTwoNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){

            System.out.print("\n\nEnter First Number : ");
            int a = input.nextInt();

            System.out.print("Enter Second Number or Zero for  exit  : ");
            int b = input.nextInt();

            if(b==0){
                break;
            }

        int result = a+b;
        System.out.print("The sum of this two Numbers is : "+result);

        }
    } 
}