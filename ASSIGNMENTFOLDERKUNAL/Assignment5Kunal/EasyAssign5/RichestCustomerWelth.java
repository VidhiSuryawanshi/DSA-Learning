import java.util.Scanner;

public class RichestCustomerWelth {
    public static void main(String[] args) {
        int [][]array = new int[3][2];
        GetArray(array);
        PrintArray(array);
        RichestCustomerWealth(array);
    }
    

    public static void GetArray(int array[][]){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.print("Enter "+i+" Array :");
            for(int j=0;j<array[i].length;j++){
                array[i][j] = in.nextInt();
            }
            System.out.println();
        }
    }
    
    public static void PrintArray(int array[][]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void RichestCustomerWealth(int accounts[][]){
            // int max = Integer.MIN_VALUE;
            // for(int i=0;i<array.length;i++){
            //     int sum=0;
            //     for(int j=0;j<array[i].length;j++){
            //         sum = array[i][j] + sum;
            //         if(sum>=max){
            //             max = sum;
            //         }
            //     }
            // }
            // System.out.println("The Richest Customer Wealth is "+max);
    
            int MaxWealth = Integer.MIN_VALUE;
            for(int i=0;i<accounts.length;i++){
                int sum = 0;
                for(int j=0;j<accounts[i].length;j++){
                    sum = sum + accounts[i][j];
                }
                if(MaxWealth<sum){
                    MaxWealth = sum;
                }
            }
            System.out.println("The Richest Customer Wealth is "+MaxWealth);

    }
}
