import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int result;
        System.out.print(a+" "+b+" ");
        for (int i=2;i<n;i++){
            result=a+b;
            System.out.print(result+" ");
            a=b;
            b=result;
        }
        input.close();
    }
}
