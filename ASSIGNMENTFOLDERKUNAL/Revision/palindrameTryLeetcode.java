import java.util.Scanner;

public class palindrameTryLeetcode {
    public static void main(String[] args) {

        System.out.println(Palindrome());

    }

    static boolean Palindrome(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number you want to check paindrome or not :");
        int num = in.nextInt();

        int Orig_Num = num ;
        int result = 0;

        while (num!=0) {
            int rem = num%10 ;
            result = result*10+rem;
            num =  num/10;
        }
        return Orig_Num==result;
    }
    
}
