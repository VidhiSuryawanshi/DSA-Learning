import java.util.Scanner;

public class Arraymax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array={1,3,5,2773,67,89};
        // int n=array.length,temp;
        // input.close();
        // for(int i=0;i<n/2;i++){
        //     temp=array[i];
        //     array[i]=array[n-i-1];
        //     array[n-i-1]=temp;
        // }
        int start=0;
        int end=array.length-1;
        while(start<end){
            swap(array,start,end);
            start++;
            end--;
        }

        for(int num:array){
            System.out.print(num+" ");
        }

        // int maximum=array[0];
        // for(int i=0;i<array.length;i++){
        //     maximum=Math.max(maximum,array[i]);
        // }
        // System.out.println(maximum);

    }
    static void swap(int[] array,int start,int end){
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
    }
}
