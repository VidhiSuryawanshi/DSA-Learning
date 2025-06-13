import java.util.Scanner;

public class Pattern6Loop {
    public static void main(String[] args){
        System.out.print("Enter the no of rows : ");
        Scanner input = new Scanner(System.in);
        int row =input.nextInt();
        for(int i=0;i<=row;i++){
            //this loop for space
            for(int space=0;space<row-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}