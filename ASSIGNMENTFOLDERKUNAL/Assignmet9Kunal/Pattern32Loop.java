public class Pattern32Loop {
    public static void main(String[] args){
        char c='a';
        char C='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(c);
                    c++; 
            }
            System.out.println();
        }
    }
}



// a
// Bc
// DeF
// gHiJ
// kLmNo