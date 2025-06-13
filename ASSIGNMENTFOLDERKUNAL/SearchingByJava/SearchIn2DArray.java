import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int target=2;
        int[] find_target=find(array,target);
        // System.out.println(find_target); //Garbage value
        // System.out.println(Arrays.toString(find_target));
    }

    static int []find(int[][]array,int target){
        if(array.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
                if(target==array[row][col]){
                    return new int[]{row,col};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
