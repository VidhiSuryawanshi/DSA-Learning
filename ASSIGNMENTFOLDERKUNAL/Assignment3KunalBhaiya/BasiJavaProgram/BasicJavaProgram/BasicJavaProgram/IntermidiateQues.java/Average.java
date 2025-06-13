import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of the number ");
        int num = input.nextInt();
        int sum=0;
        int count=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
            count++;
        }
       // System.out.println("Sum : "+sum);
       // System.out.println("Count : "+count);
        int Average=sum/count;
        System.out.println("Average : "+Average);
    }
    
}
