import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){

        System.out.print("Enter a number You wants to check Even or Odd:");
        if(input.hasNextInt()){
            int a=input.nextInt();
            if(a%2==0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        else if(input.hasNext("exit")){
            System.out.println("Exiting the program");
            break;
        }
        else{
            System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit");
            input.next();
        }
      }
      input.close();
   }
}