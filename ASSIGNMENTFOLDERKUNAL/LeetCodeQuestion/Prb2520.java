class Solution {
    public void countDigits(int num) {
        int count=0;
        for(int val=2;val<=num;val++){
            if(num%val==0){
                System.out.println(val);
                count++;
            }
        }
        System.out.println(count);
    }
}
public class Prb2520 {
    public static void main(String[] args) {
        // Solution cd = new Solution();
        // cd.countDigits(1248);
        DigitExtraction(7);
    }

    public static void DigitExtraction(int n){
        int Original_num=n;
        int count =0;
        while(n!=0){
            int digit=n%10;
            if(Original_num%digit==0 && digit!=0 ){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
