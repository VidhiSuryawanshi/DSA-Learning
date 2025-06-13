import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the length of the Array :");
        int n = in.nextInt();
        int nums[] = new int[n];
        int ans[] = new int[2*n];

    System.out.println("Enter the "+n+" element for the array : ");
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }

    System.out.println("\nThe Array is :");
        for(int array:nums){
            System.out.print(array+" ");
        }
/////////////////////////////////////////////////
        for(int i=0;i<n;i++){
                ans[i]=nums[i];
        }

        for(int i=0;i<n;i++){
                ans[i+n]=nums[i];
        }
//////////////////////////////////////////

    System.out.println("The Ans Array is :");
        for(int array:ans){
            System.out.print(array+" ");
        }
    }
}