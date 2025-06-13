// import java.util.Scanner;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number you want to check Palindrome or not :");
//         int num = input.nextInt();
//         int rev = 0;
//         int Orig_Num = num;
         
//         while(num!=0){
//             int reminder=num%10;
//             rev = rev*10+reminder;
//             num/=10;
//         }
//         // System.out.println(rev);
//         if(Orig_Num==rev){
//             System.out.println("Given Number "+Orig_Num+" is Palindrme");
//         }
//         else{
//             System.out.println("Given Number "+Orig_Num+" is not Palindrme");
//         }

//         input.close();
//     }
    
// }



class Solution {
    public boolean isPalindrome(int x) {
        x=10;
        int rev = 0;
        int Orig_Num = x;

        int vidhi = 21 ;
        
        while(x!=0){
            int reminder=x%10;
            rev = rev*10+reminder;
            x/=10;
        }
        // System.out.println(rev);
        if(Orig_Num==x){
            return true;
        }
        else{
            return false;
        }
    }
}
