public class Pattern11Loop {
    public static void main(String[] args) {
        int i,j,space;
        for( i=4;i>=1;i--){
            for( space=4-i;space>=1;space--){
                System.out.print(" ");
            }
            for( j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
