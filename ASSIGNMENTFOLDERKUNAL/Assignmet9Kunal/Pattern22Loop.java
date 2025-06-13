import java.util.Scanner;

public class Pattern22Loop {
      public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int row=input.nextInt();
        Pattern1byme();
        Pattern1(row);
        Pattern2(row);

    }


    static void Pattern1byme(){
         for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    if(i==j||(i==3&&j==1)||(i==4&&j==2)){
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }
                }
                System.out.println();
        }
    }
    
    static void Pattern1(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){//Check the sum of row & coloum indises is zero
                    System.out.print(1+"");
                }
                else {
                    System.out.print(0+"");
                }
            }
            System.out.println();
        }
    }

    static void Pattern2(int row){
        for(int i=1;i<=row;i++){
            for(int space=1;space<=row-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if((i+j)%2==0){//Check the sum of row & coloum indises is zero
                    System.out.print(1+"");
                }
                else {
                    System.out.print(0+"");
                }
            }
            System.out.println();
        }
    }

}
