public class LinearSearch {
    public static void main(String[] args) {
        int[] num={23,45,1,22,8,-19,19,3,16,-11,28};
        int target=19;
        int ans=linear(num,target);
        System.out.println("The target index if"+ans);
        int s=search(num,target,1,4);
        System.out.println("The target index is from range is:"+s);
        int max=maximum(num);
        System.out.println("The maximum of the array is:"+max);
        int min=minimum(num);
        System.out.println("The minimum of the array is:"+min);

    }

    static int maximum(int[] num){
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;

    }

    static int minimum(int[] num){
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        return min;

    }



    static int search(int[] num,int target,int start ,int end){
        if(num.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(target==num[i]){
                return i;
            }
        }
        return -1;

    }







    static int linear(int[] num,int target){
        if(num.length==0){
            return -1;
        }
        for(int i=0;i<num.length;i++){
            if(target==num[i]){
                return i;
            }
        }
        return -1;

    }


}
