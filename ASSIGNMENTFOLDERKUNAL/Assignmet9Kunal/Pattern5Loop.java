public class Pattern5Loop {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=2;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
