import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args){
        System.out.print("Enter the number of rows = ");
        Scanner vidhi = new Scanner(System.in);
        int row = vidhi.nextInt();

        //1/ for(int i=0;i<row;i++){
        //     for(int j=0;j<row;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //2/ for(int i=0;i<row;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //3/ for(int i=row;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //4/ for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.printf("%d",j);
        //     }
        //     System.out.println();
        // }


        //5/ for(int i=0;i<row;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=row-1;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        

        for(int i=row;i>0;i--){
            for(int space=i;space>0;space--){
                System.out.print("U");
            }

            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}