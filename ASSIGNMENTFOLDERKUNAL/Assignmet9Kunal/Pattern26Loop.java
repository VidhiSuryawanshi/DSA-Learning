public class Pattern26Loop {
    public static void main(String [] args){
        Pattern10byMe();
        Pattern10RealLogic();
}


static void Pattern10byMe(){
    int number=1;
    for(int i=5;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print(number);
        }
        System.out.println();
        number++;
    }
}

static void Pattern10RealLogic(){
    for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();
    }

}

}