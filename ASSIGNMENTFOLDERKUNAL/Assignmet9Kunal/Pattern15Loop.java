public class Pattern15Loop {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            for(int space=4-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
