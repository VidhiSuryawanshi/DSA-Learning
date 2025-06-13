//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1
 public class Pattern17Loop {
    public static void main(String[] args) {
        int i,j,space;
        for( i=1;i<=4;i++){
            for(space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for( i=3;i>=1;i--){
            for(space=4-i;space>=1;space--){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=i;j>1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
