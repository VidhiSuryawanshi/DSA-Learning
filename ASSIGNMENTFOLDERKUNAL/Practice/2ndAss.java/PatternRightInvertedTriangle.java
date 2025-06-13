import java.util.Scanner;

public class PatternRightInvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range of the pattern : ");
        int range = input.nextInt();
        
        for(int i=range;i>0;i--){
            for(int space=0;space<range-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.printf("*",j);
            }
            System.out.println("");
        }
    }
    
}
