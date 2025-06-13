import java.util.Scanner;

public class ArrayAll {
    public static void main(String[] args) {
        int[] array = new int[5];
        GetArray(array);

        // MaxValueOfArray(array);
        // MinValueOfArray(array);
        // ReverceTheArray(array,0,array.length-1);
        // SearchInArray(array);
        // InsertElementInArray(array,3,87);
    
        // System.out.println("\nArray Before Swapping :");
        PrintArray(array);

        // SwappingValueInArray(array,2,4);
        // System.out.println("\nArray After Swapping :");
        // PrintArray(array);

        // DeletionInArray(array,1);

    }
    static void DeletionInArray(int array[],int position){
        for (int i=position;i<=array.length-2;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0;

        System.out.println("\nArray After Deletion :");
        PrintArray(array);
    }

    static void InsertElementInArray(int array[],int index,int element){
        for(int i=0;i<array.length;i++){
            if(index==i){
                array[i]=element;
            }
        }
        System.out.println("\n\nArray After Insertion :");
        PrintArray(array);

    }

    static void SearchInArray(int array[]){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter the value you have to search inn array : ");
        int target = input.nextInt();

        int count =0;
        for(int i=0;i<array.length;i++){
            if(target==array[i]){
                System.out.println("Value find in Index "+i);
                count++;
            }
        }
        if(count==0){
            System.out.println("Value Not Exist in Array");
        }

    }

    static void GetArray(int array[]){
        Scanner input = new Scanner(System.in);
        // int[] array = new int[9];

        //to get elements o fthe array
        System.out.println(" Enter the "+array.length+" element for the Array :");
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
    }

    static void PrintArray(int array[]){
        //for print ARRAY
        for(int num:array){
            System.out.print(num+" ");
        }
    }

    static void SwappingValueInArray(int array[],int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void MaxValueOfArray(int array[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<=array[i]){
                max=array[i];
            }
        }
        System.out.println("\nThe Maximum Value of the array is : "+max);
    }

    static void MinValueOfArray(int array[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(min>=array[i]){
                min=array[i];
            }
        }
        System.out.println("\nThe Minimum Value of the array is : "+min);

    }

    static void ReverceTheArray(int array[],int i,int j){
        while(i<j){
            SwappingValueInArray(array, i, j);
            i++;
            j--;
        }
        System.out.println("\n\nArray After Reverce :");
        PrintArray(array);
    }
   
}