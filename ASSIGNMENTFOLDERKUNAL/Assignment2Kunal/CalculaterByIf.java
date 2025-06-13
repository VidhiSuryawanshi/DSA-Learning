import java.util.Scanner;

public class CalculaterByIf {

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    
    while(true){

    System.out.print("Enter First Number :");
    int a=input.nextInt();

    System.out.print("Enter Second Number :");
    int b=input.nextInt();

    System.out.print("Enter Operater(+,-,*,/,%) or 'q' to Exit :");
    char operator=input.next().trim().charAt(0);

    if(operator=='+'){
        System.out.println("The Sum Is :"+(a+b));
    }

    else if(operator=='-'){
        System.out.println("The Subtraction Is :"+(a-b));
    }

    else if(operator=='*'){
        System.out.println("The Multiplication Is :"+(a*b));
    }

    else if(operator=='%'){
        System.out.println("The Division  Is :"+(a%b));
    }

    else if(operator=='/'){
        if(b!=0){
        System.out.println("The Divide Is :"+(a/b));
       }
       else{
        System.out.println("Error : Divide by Zero is not Possible .");
       }
    }
    else if(operator=='q'){
        System.out.println("Exit the program");
        break;
    }

    else {
        System.out.println("Enter Valid Operator:");
    }

    }

    input.close();

   }

}