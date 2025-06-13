import java.util.*;

public class ShuffelTheArray {
    public static void main(String[] args) {
        int nums [] = new int[6];
        int newNums[] = new int[nums.length*2];
        GetArray(nums);
        PrintArray(nums);
        Shuffel(nums);
      
    }

    public static void Shuffel(int array[]){
        int newArray1[] = new int[array.length/2];
        int newArray2[] = new int[array.length-array.length/2];
        int newArray3[] = new int[array.length];

        for(int i=0;i<array.length/2;i++){
            newArray1[i] = array[i];
        }
        PrintArray(newArray1);

        for(int i=array.length/2;i<array.length;i++){
            newArray2[i-array.length/2] = array[i];
        }
        PrintArray(newArray2);

        System.out.print("\nThe Shuffel Array is :");
        for(int i=0;i<array.length;i++){
            System.out.print(newArray1[i]+" "+newArray2[i]+" ");

        }
        // PrintArray(newArray2);

        
    }

    public static void GetArray(int array[]){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.print("Enter the "+i+" Element of the Array :");
            array[i] = in.nextInt();
        }
    }

    public static void PrintArray(int array[]){
        System.out.print("\nThe  Array is :");
        for(int arr:array){
            System.out.print(arr+" ");
        }
    }


    // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    // Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    // Input: nums = [2,5,1,3,4,7], n = 3
    // Output: [2,3,5,4,1,7] 
    // Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

    
}
