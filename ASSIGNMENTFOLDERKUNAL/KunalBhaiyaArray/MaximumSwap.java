public class MaximumSwap {
    public static void main(String[] args) {
        int num = 27222236;
        // int Original = 0;
        // int max = Integer.MIN_VALUE;
        while(num!=0){
            int rem = num%10;

            System.out.print(rem);
            // Swap(rem,max);
            num=num/10; 
        }
        // System.out.println(Original);
    }

    public static void Swap(int a,int b){
        int temp = a;
            a = b ;
            b =temp;
    }
    
}
