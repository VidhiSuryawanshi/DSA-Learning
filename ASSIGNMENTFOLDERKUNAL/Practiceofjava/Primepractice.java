import java.util.Scanner;

public class Primepractice{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b= input.nextInt();
        for(int i=a;i<b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        input.close();
    }

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return true;
        }
        if (num%2==0){
            return false;
        }
        for(int j=2;j*j<=num;j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
}
