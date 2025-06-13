import java.util.Arrays;
public class MaxItemInArray {
    public static void main(String[] args){
        int[] arr1 = {12, 3, 2, 923, 18, 558};
        int[] arr2 = {1, 3, 34, 56, 79, 244, 5667, 455, 3};
        MaxItemInArrayByMe(arr1);
        System.out.printf("The Max Value In The 2nd Array is %d",MaxItemInArrayByKunal(arr2));
        System.out.printf("The Max Value In The 1st Array from index 1 to 3 is %d", MaxItemInArrayRangeByKunal(arr1,1,3));
    }

    static void MaxItemInArrayByMe(int[] arr){
        System.out.println("\nThe 1st Array is :"+Arrays.toString(arr));
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else{
                continue;
            }
        }
        System.out.printf("The max value of the Array 1st is %d \n ",max);

    }
    
    static  int MaxItemInArrayByKunal(int[] kunal){
        System.out.println("\nThe 2nd Array is : "+Arrays.toString(kunal));
        //Imagine the array is not empty
        int MaxValue = kunal[0];
        for(int i=0;i<kunal.length;i++){
            if(kunal[i] > MaxValue){
                MaxValue =kunal[i];
            }
        }
        return MaxValue;
    }

    static  int MaxItemInArrayRangeByKunal(int[] kunal, int start,int end){
        System.out.println("\nThe 2nd Array is : "+Arrays.toString(kunal));
        //Imagine the array is not empty
        if(end > start){
            return -1;
        }
        if(kunal == null){
            return -1;
        }
        int MaxValue = kunal[start];
        for(int i=start;i<end;i++){
            if(kunal[i] > MaxValue){
                MaxValue =kunal[i];
            }
        }
        return MaxValue;
    }

}
