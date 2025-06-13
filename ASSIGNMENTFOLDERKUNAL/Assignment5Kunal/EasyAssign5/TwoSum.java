import java.util.*;

public class TwoSum{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Array :");
        int n = in.nextInt();
        int nums[] = new int[n];
        GetArray(nums,n);
        // PrintArray(nums,n);
        TwoSums(nums,n,9);
        
    }

    static void GetArray(int nums[],int n){

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter "+n+ " element of array:");
        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
    }

    static void PrintArray(int nums[],int n){
        for(int array:nums){
            System.out.print(array+" ");
        }
    }

    static void TwoSums(int nums[],int n,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==(nums[i]+nums[j])){
                    System.out.println(i+","+j);
                }
            }
            System.out.println();
        }
    }


}
