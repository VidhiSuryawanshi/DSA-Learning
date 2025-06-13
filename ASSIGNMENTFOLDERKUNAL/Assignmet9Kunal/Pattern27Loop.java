public class Pattern27Loop {
    public static void main(String[] args) {
        int number=1;
        for(int i=4;i>=1;i--){
            for(int space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }

            int number2=1;
            for(int j=i;j>=1;j--){
                System.out.print(number2);
                number2++;
            }

            System.out.println();
        }

    }
    
}


// 123417181920
//  567141516
//   891312
//    1011