public class Pattern25Loop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int space=0;space<5-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                if(i==0||i==4||j==0||j==4){
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
