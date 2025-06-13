public class Pattern28Loop {
    public static void main(String[] args) {
        int i,j,space;
        for(i=1;i<=4;i++){
            for(space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=3;i>=1;i--){
            for(space=4-i;space>=1;space--){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
