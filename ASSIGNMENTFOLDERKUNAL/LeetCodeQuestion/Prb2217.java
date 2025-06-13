public class Prb2217 {
    public static void main(String[] args) {

        // palindrome();
        // DigitExtraction();
        // System.out.println(DigitExtraction());
        CountDigitPrintPalinome();

    }

    public static void CountDigitPrintPalinome(){
        int intLength = 3;
        int [] queries = {1,2,3,4,5,90};
        int count=0;
        for(int i=1;i<1000;i++){
            int x=i;
            int Ori_num=x;
            int rem;
            int res=0;
            while(x!=0){
                rem=x%10;
                res=res*10+rem;
                x/=10; 
            }
            if(res==Ori_num){
                if(DigitExtraction(res)==intLength){
                    System.out.print(res+" ");
                    count++;
                    // for(int j=queries[0];j<queries[queries.length-1];j++){
                    //     count=queries[j];
                    //     System.out.print(res+" ");
                    // }
               }
            }
        }

    }

    public static void palindrome(){

        for(int i=1;i<100000;i++){
            int x=i;
            int Ori_num=x;
            int rem;
            int res=0;
            while(x!=0){
                rem=x%10;
                res=res*10+rem;
                x/=10; 
            }
            if(res==Ori_num){
                System.out.print(res+" ");
            }
        }

    }
    
    public static int DigitExtraction(int num){
        int count=0;
        int digit;
        int Original_Digit=num;
        while(num!=0){
            digit = num%10;
            // System.out.println(digit);
            count++;
            num/=10;
        }
        return count;
    }
}
