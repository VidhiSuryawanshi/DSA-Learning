import java.util.Scanner;

public class ReverceAndPalindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Any Number :");
        int original=input.nextInt();
        int a=original;
        int rev=0;
        int rem;
        
        while(a!=0){
            rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }

        System.out.println("The Reverce Of The Number is :"+rev);

        if(original==rev){
            System.out.println("The Number Is Palindrome");
        }
        else{
            System.out.println("The Number Is Not Palindrome");
        }
        input.close();
    }
}