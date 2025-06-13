import java.util.Scanner;

public class PrimeBetween2No{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.print("Enter any integer :");
        // System.out.print("\nEnter First integer :");
        int a = input.nextInt();
        // System.out.print("Enter Second integer :");
        // int b = input.nextInt();
        PrimeCheck(a);
        // PrimeCheck(a,b);
        }
    }


//print prime 
      static void PrimeCheck(int a){
            if(a<=1){
                System.out.println("Not Prime ");
                return;
            }
    
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    System.out.println("Not Prime ");
                    return;  
                }
            }
            System.out.println(" Prime Number ");
        }
    

    // static void PrimeCheck(int a,int b){
    //         if(a< 1 && b<1){
    //             System.out.println("Not Prime ");
    //             return;
    //         }
    // for(int j=a;j<=b;j++){
    //         for(int i=2;i<=Math.sqrt(j);i++){
    //             if(j%i==0){
    //                 System.out.printf("%d=not prime",j);
    //                 // return;  
    //             }
    //         }
    //         System.out.printf("%d= prime",j);
    //     }
    // }




    // static void PrimeCheck(int a){
    //     if(a<=1){
    //         System.out.println("Not Prime ");
    //         return;
    //     }

    //     for(int i=2;i<=Math.sqrt(a);i++){
    //         if(a%i==0){
    //             System.out.println("Not Prime ");
    //             return;  
    //         }
    //     }
    //     System.out.println(" Prime Number ");
    // }

}