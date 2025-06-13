import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayClassKunal {
    public static void main(String[] args) {
        // IntroArray();
        // ArrayInput();
        // PassingArrayInFunction();
        // MultiDimentionalArray();
        // ColNoFixed();
        // ArrayList();
        // ArrayListByMe();
        MultiDimentionalArrayList();
    }

    static void IntroArray(){
        //Q: store a roll number
        int a = 10;

        //Q: store 5 roll no
        String name = "Kunal Kushwaha";
        
        //Q: store 5 roll no
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll no

        int [] rnos = new int[5];
        // or directly
        int[] ros2 = {23, 12, 45, 32, 15};
        ros2[0]=22;
        for(int i=0;i<5;i++){
            System.out.print(ros2[i]+" ");
        }

        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5];// initialization:actually here object is being created in the memory (heap)
        String[] arr = new String[4];
        System.out.println(arr[0]);

        // String str = null;
        // int num = null;


    }

    static void ArrayInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element of the array");
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        //[23 , 45, 233, 543, 3]
        System.out.println(arr[3]);
        // input using for loop
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
          System.out.print(arr[i]+" ");
        }

        // Inhanced for loop
        for(int num : arr){//for every element of the array , print the array
            System.out.print(num  + " ");//here num represents elements of the array
        }

        
        System.out.println(arr[5]);//Index out of bounds error


        // array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        //modify
        str[1]=in.next();
        System.out.println(Arrays.toString(str));

        
    }

    static void PassingArrayInFunction(){
        int[] nums = {  3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        nums[0]=99;
        System.out.println(Arrays.toString(nums));
    }
    
    static void MultiDimentionalArray(){
    /*
          1 2 3
          4 5 6 
           7 8 9 
         */
        Scanner input = new Scanner(System.in);
        // int [][]arr2D=new int [3][];

        // //Directly store 
        // int[][] arr2D = {
        //                 {1, 2, 3},
        //                 {4, 5, 6},
        //                 {7, 8, 9}
        //             };
        

        // //for printing
        // for(int row=0;row<arr2D.length;row++){
        //     for(int col=0;col<arr2D.length;col++){
        //         System.out.printf("%d"+" ",arr2D[row][col]);
        //     }
        //     System.out.println();
        // }
        

        //for input
        int[][] arr2d = new int[3][3];

        System.out.println("Enter the  element for (3*3 matrices) of the array :");
        // System.out.printf("Length is ="+"%d",arr2d.length);//no of rows
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col<arr2d[row].length;col++){
                arr2d[row][col]=input.nextInt();
            }
        }

        //Inhanced For Loop
        //In  this Every Single Element of the Array is Itself Array
        for(int[] a : arr2d){
            System.out.println(Arrays.toString(a));
        }

        // for(String element : arr2d){
        //     System.out.println(element);
        // }
      
        // for(int row=0;row<arr2d.length;row++){
        //     System.out.println(Arrays.toString(arr2d[row]));
        // }

        // for(int row=0;row<arr2d.length;row++){
        //     for(int col=0;col<arr2d[row].length;col++){
        //         System.out.print(arr2d[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // int[][] arr=new int [3][];

        // int [][] arr2D = { 
        //     {1,2,3},// 0th index
        //     {4,5},// 1st index
        //     {6,7,8,9}//2nd index -> arr2d[2] = { 6,7,8,9} ->if we write arr2d[2][0] then it give us 6
        //     };
             
        //     for(int row=0;row<arr2D.length;row++){
        //         for(int col=0;col<arr2D[row].length;col++){
        //             System.out.print(arr2D[row][col]+" ");
        //         }
        //         System.out.println();
        //     }

    }

    static void ColNoFixed(){
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
            };

            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
    }

    static void ArrayListByMe(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>(5);
        list.add(23);
        list.add(90);
        list.add(23);
        System.out.println(list);
        list.set(2,34);
        System.out.println(list);
        System.out.println(list.contains(34));
    }
    
    static void ArrayList(){
        ArrayList<Integer>list=new ArrayList<>(10);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(57);
        list.add(87);

        System.out.println(list);

        list.set(0,3455);
        System.out.println(list);

        System.out.println(list.contains(45));//it gives true or false


        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }

    static void MultiDimentionalArrayList(){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();

        //initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //add element 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
       System.out.println(list);
    }


}
