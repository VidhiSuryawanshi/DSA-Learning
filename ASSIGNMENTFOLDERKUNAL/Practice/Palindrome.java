public class Palindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            int rem;
            int res=0;
            int Orig_num = x;
            if(x<0){
                return false;
            }
            while(x!=0){
                rem = x%10;
                res = res*10+rem;
                x/=10;
            }
            if(res==Orig_num){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
         isPalindrome(121);
        
    

    
}
}