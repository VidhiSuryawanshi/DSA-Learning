class Solution {
    public int reverse(int x) {
        int res = 0;

        while(x!=0){
            int rem = x%10;
            res = res*10+rem;
            x/=10;
        }

        return res;
    }
}
public class Reverse {
    public static void main(String[] args) {
        Solution r = new Solution();
        int result = r.reverse(12321);
        System.out.println("The Reverse is 12321 : "+result);

    }
    
}
