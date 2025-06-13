public class Pattern30Loop {
    public static void main(String[] args) {
        int i,j,space;
        for(i=1;i<=4;i++){
            for(space=1;space<=4-i;space++){
                System.out.print(" ");
            }

            for( j=i;j>=1;j--){
                System.out.print(j);
            }
            for( j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
//    1
//   212
//  32123
// 4321234
