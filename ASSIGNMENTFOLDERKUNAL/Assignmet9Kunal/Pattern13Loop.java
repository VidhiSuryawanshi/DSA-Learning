public class Pattern13Loop {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int space=1;space<=5-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==1||i==5||j==1||j==2*i-1){
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