import java.util.*;
public class Extracandiess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int extraCandies = 0;
        System.out.println("Enter the Number of kids :");
        int n = in.nextInt();
        int [] candies = new int[n];
        GetCandies(candies,n);
        PrintCandies(candies);
        FindExtraCandies(candies,n);
        FindKidsWithGreatestNoOfCandies(candies,n);

    }

    public static void FindKidsWithGreatestNoOfCandies(int candies[],int n){
        FindExtraCandies(candies,n);
        System.out.println(extracandies);
        int sum = candies[0]+ extracandies;
        for(int i=0;i<n;i++){
            int new_sum = candies[i]+extracandies;
            if(new_sum>=sum){
                System.out.print("true"+" ");
            }
            else{
                System.out.print("False"+" ");
            }
        }
    }

    public static void FindExtraCandies(int candies[],int n){
        int extracandies;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(candies[i]==candies[j]){
                    extracandies = candies[i];
                }
            }
        }
        System.out.println("The extracandie is "+extracandies);
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


}

