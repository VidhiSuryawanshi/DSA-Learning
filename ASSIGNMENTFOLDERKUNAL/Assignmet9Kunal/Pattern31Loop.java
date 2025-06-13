// 3 3 3 3 3 
// 3 2 2 2 3
// 3 2 1 2 3
// 3 2 2 2 3
// 3 3 3 3 3
public class Pattern31Loop {
    public static void main(String [] args){
        Pattern31byMe();
        Pattern31byKunal(4);
        Pattern31byKunal2(4);
    }


    static void Pattern31byMe(){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                // System.out.print(i);
                if(i==0||i==4||j==0||j==4){
                    System.out.print("3 ");
                }
                else if(i==2&&j==2){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }

    }
    

    static void Pattern31byKunal(int n){
        int originalN =n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex = originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }
    static void Pattern31byKunal2(int n){ 
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex = Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }
}
