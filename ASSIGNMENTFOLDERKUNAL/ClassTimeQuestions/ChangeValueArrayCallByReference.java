import java.util.Arrays;
public class ChangeValueArrayCallByReference {

    public static void main(String[] args) {
        int []arr={1,2,3,45,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[]nums){
        nums[0]=99;
        nums[1]=12;
    }
}
