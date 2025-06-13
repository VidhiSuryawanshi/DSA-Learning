import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Currency in Rupees : ");
        float rupees = input.nextFloat();

        double usd = 0.012 * rupees;
        
        System.out.printf("%.3f rupees in US Currency is %.3f dollar\n",rupees,usd);

        input.close();
    }
}