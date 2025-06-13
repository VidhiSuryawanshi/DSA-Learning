import java.util.Scanner;

public class salary {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=input.nextInt();
        int bonus;
        if (salary>10000){
            bonus=salary+2000;
        }
        else{
            bonus=salary+1000;
        }
        System.out.println(bonus);
        input.close();
    }
}
