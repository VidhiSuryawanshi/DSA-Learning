import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=1,result=0;

        System.out.print("Enter Range For Fibonacci Series : ");
        int n = input.nextInt();

        System.out.print(a+" "+b);

        for(int i=2;i<n;i++){
            result=a+b;
            System.out.print(" "+result);
            a=b;
            b=result;
        }
        System.out.println(" ");
        input.close();
    }
}