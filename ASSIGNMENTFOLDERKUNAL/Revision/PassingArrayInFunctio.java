import java.util.Arrays;

public class PassingArrayInFunctio {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 55};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=54;
    }
    
}
