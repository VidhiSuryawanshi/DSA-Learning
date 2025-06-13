import java.util.Scanner;
public class Revision1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number :");
        int a= input.nextInt();
        EvenOddCheck(a);
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
        Pattern6();
        Pattern7();
    }

    static void EvenOddCheck(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    static void Pattern1(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(){
        for(int i=0;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void Pattern3(){
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void Pattern4(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d",j);
            }
            System.out.println();
        }
    }
    


    static void Pattern5(){
        for(int i=0;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void Pattern6(){
        for(int i=1;i<=4;i++){
            for(int space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(){
        for(int i=4;i>0;i--){
            for(int space=4-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }





}
