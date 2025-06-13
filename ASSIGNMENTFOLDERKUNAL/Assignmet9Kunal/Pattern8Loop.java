// public class Pattern8Loop {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int space=1;space<=4-i;space++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }







import java.util.Scanner;

public class Pattern8Loop {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows :");
        Scanner vidhi = new Scanner(System.in);
        int row = vidhi.nextInt();

        for(int i=1;i<=row;i++){
            for(int space=0;space<=row-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

System.out.print("Vidhi");
    }
}
