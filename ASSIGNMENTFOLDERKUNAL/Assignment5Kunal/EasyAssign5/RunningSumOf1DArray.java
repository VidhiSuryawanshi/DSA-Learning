import java.util.Scanner;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        int sumarray[] = new int[array.length];

        // for(int Runningarray:array){
        //     System.out.print(Runningarray+" ");
        // }

        sumarray[0]=array[0];
        for(int i=1; i<array.length ;i++){
            sumarray[i]= sumarray[i-1]+array[i];
        }

        for(int Runningarray:sumarray){
            System.out.print(Runningarray+" ");
        }
    }
}
