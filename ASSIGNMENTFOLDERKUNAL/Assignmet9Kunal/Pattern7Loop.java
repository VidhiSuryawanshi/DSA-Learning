import java.util.Scanner;

public class Pattern7Loop{
    public static void main(String[] args){
        System.out.print("Enter the no. of rows : ");
        Scanner vidhi = new Scanner(System.in);
        int row = vidhi.nextInt();
        for(int i=row;i>0;i--){
            for(int space=row-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
