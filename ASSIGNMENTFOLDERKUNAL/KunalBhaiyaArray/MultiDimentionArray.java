import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int [][] array = new int[4][4];
        //  int array [][]  ={
        //     {2, 3 , 3  ,9 ,54},
        //     {1, 7 , 5  ,6 ,3 ,4},
        //     {2, 79, 987,98}
        //     };

       System.out.println(array.length);


       //taken  multidimentional array by user 
        for( int i=0;i<array.length;i++){
            System.out.println("Enter "+i+" Array"); 
            for(int j=0;j<array[i].length;j++){
                array[i][j]=input.nextInt();
            }
            System.out.println();
        }

        //for printing Multidimensional Array
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }


}

