import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of the Fibonacci Series : ");
        int n = input.nextInt();

        int a=0,b=1;
        System.out.printf("%d  %d  ",a,b);
        for(int i=0;i<n-2;i++){
            int result = a+b;
            System.out.printf("%d  ",result);
            a=b;
            b=result;
        }

    }
    
}
