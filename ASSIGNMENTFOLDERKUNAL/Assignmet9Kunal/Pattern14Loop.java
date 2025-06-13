public class Pattern14Loop {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int space=5-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                if(i==5||i==1||j==2*i-1||j==1){
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
