import java.util.Scanner;

public class Pattern21Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of line you want to print:");
        int a = input.nextInt();
        int number=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number=number+1;

            }
            System.out.println();
        }

    }
    
}
