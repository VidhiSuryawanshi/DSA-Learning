import java.util.Scanner;

public class Armstrongpractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        // int rem,sum=0;
        // int real_a=a;
        // int num_digit=String.valueOf(a).length();
        // while(a!=0){
        //     rem=a%10;
        //     sum+=Math.pow(rem, num_digit);
        //     a/=10;
        // }
        // if(sum==real_a){
        //     System.out.println("Armstrong");
        // }
        // else{
        //     System.out.println("Not Armstrong");
        // }
        for(int i=a;i<=b;i++){
            if(isArm(i)){
                System.out.print(i+" ");
            }

        }
    }
    static boolean isArm(int i){
        int real=i;
        int num_digit=String.valueOf(i).length();
        int rem,arm=0;
        while(i!=0){
            rem=i%10;
            arm+=Math.pow(rem,num_digit);
            i/=10;
        }
        return arm==real;
    }
}
