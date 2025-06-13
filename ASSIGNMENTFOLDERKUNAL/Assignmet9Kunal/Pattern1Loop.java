import java.util.Scanner;

public class Pattern1Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            System.out.print("* ");
            }
            System.out.print("\n");
        }
    }   
}