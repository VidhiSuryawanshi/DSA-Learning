import java.util.Scanner;

public class FindPalindrameWithFixedLength {
    public static void main(String[] args) {
        int[] queries = {1,3,4,5,64,43};
        //palindrome();
        PrintNPalindome();


    }

    public static void PrintNPalindome(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        for(int i=1;i<n;i++){
            int x=i;
            int Orig_num=x;
            int res=0;
            int rem;
            while(x!=0){
                rem=x%10;
                res =res*10+rem;
                x/=10;
            }
            if(res==Orig_num){
                System.out.print(res+" ");
            }
        }
    }

    public static void palindrome(){
        int x=101;
        int Orig_num=x;
        int res=0;
        int rem;
        if(x<0){
            System.out.print("Not Palindrome ");
        }
        while(x!=0){
            rem=x%10;
            res =res*10+rem;
            x/=10;
        }
        if(res==Orig_num){
            System.out.println("palindrome = "+res);
        }
        else{
            System.out.print("Not Palindrome ");
        }
    }
}
