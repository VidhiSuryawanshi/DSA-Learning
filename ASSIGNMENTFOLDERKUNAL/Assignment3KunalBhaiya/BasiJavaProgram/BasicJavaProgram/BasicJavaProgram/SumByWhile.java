import java.util.Scanner;

public class SumByWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("\n\nEnter any Integer or Zero to exit : ");
            int a = input.nextInt();
            if(a==0){
                break;
            }
            else{
                sum=sum+a;
            }
        }
        System.out.println("\nThe Sum of all the Numbers is : "+sum);
    }
    
}
