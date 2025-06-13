public class Pattern24Loop {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            for(int space=2*(5-i);space>=1;space--){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                if(i==1||j==1||j==i){
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
