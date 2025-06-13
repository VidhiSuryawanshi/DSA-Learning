import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int a=input.nextInt();
        // if (a%2==0){
        //     System.out.println("Not Prime");
        // }
        // else{
        //     System.out.println("Prime");
        // }
        // input.close();
        // print prime from a between a and b

        System.out.println("Enter a two number:");
        int a = input.nextInt();
        int b= input.nextInt();
        for(int i=a;i<b;i++){
            int num=i;
            if(num%i==0){
                continue;
            }
            else{
                System.out.print(num+" ");
            }
        }
        input.close();
    }
}
