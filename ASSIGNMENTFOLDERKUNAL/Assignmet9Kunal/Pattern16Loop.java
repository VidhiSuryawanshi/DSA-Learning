public class Pattern16Loop {
    public static void main(String[] args) {
        int i,j,space;
        for(i=0;i<=4;i++){
            for(space=0;space<=4-i;space++){
                System.out.print(" ");
            }
            int number=1;
            for(j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    } 
}





//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
