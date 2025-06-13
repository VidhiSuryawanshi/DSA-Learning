public class SumToleetcode {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,9} ;
        int target = 7 ;
        int sum=0;
        for(int row = arr.length;row>0;row--){
            for(int skip=0;skip<arr.length-row; skip++){
                continue;
            }
            for(int col=row;col>0;col--){
                sum = arr[row]+arr[col];

                System.out.print(sum+" ");

                if(sum==target){
                    System.out.println(arr[row]+arr[col]);
                    break;
                }
            }

        }
    }
    
}
