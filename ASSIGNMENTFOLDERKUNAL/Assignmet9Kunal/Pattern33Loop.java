public class Pattern33Loop{
    public static void main(String [] args){
        char start='A';
        char end='E';
        for(char i=end;i>=start;i--){
            for(char j=i;j<=end;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
// E
// DE
// CDE
// BCDE
// ABCDE
