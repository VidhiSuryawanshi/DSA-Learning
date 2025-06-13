public class Pattern9Loop {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int space=4-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
