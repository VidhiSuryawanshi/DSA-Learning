import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check Factorial : ");
        int num = input.nextInt();
        int fact = 1;
        for(int i=num; i>0; i--){
            if(i==1){
                System.out.print(i);
            }
            else{
                System.out.print(i+"*");
                fact*=i;
            }
        }
        System.out.println("\n"+fact);
        
        input.close();
    }
}