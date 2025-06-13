import java.util.Scanner;

public class LargestFromAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNo=0;


        while (true) {
            System.out.print("Enter the number or zero to exit :  ");
            int  num =input.nextInt();
                if(largestNo<=num){
                    largestNo=num;
                }
        }
        // System.out.print("The Largest Number is "); 
        // System.out.println();
    }
}