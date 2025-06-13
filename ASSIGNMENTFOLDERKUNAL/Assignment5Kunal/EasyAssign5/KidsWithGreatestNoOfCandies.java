import java.util.Scanner;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int extraCandies = 0;
        System.out.println("Enter the Number of kids :");
        int n = in.nextInt();
        int [] candies = new int[n];
        GetCandies(candies,n);
        PrintCandies(candies);
        FindExtraCandies(candies,n,extraCandies);
        FindKidsWithGreatestNoOfCandies(candies,n,extraCandies);

    }

    public static void FindKidsWithGreatestNoOfCandies(int candies[],int n,int extracandie){
        System.out.println(extracandie);
        int sum = candies[0]+ extracandie;
        for(int i=0;i<n;i++){
            int new_sum = candies[i]+extracandie;
            if(new_sum>=sum){
                System.out.print("true"+" ");
            }
            else{
                System.out.print("False"+" ");
            }
        }
    }

    public static void GetCandies(int candies[],int n){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter the candies for "+(i+1)+" kid = ");
            candies[i] =  in.nextInt();
        }
    }
    
    public static void PrintCandies(int candies[]){
        for(int arr:candies){
            System.out.print(arr+" ");
        }
    }

    public static void FindExtraCandies(int candies[],int n,int extraCandies){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(candies[i]==candies[j]){
                    extraCandies = candies[i];
                }
            }
        }
        System.out.println("The extracandie is "+extraCandies);
    }


}
