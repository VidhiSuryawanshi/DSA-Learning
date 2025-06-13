public class PatternClass {
    public static void main(String[] args) {
        Pattern1(4);
        Pattern2(4);
        Pattern3(4);
        Pattern4(4);
        Pattern5(4);
        Pattern28(4);
        Pattern30(5);
        Pattern17(5);
    }

static void Pattern1(int n){
    for(int row=1;row<=n;row++){
        //for every row,run the col
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        //when one row is printed ,we need  to add a newline
        System.out.println();
    }
}

static void Pattern2(int n){
    for(int row=1;row<=n;row++){
        //for every row,run the col
        for(int col=1;col<=n;col++){
            System.out.print("* ");
        }
        //when one row is printed ,we need  to add a newline
        System.out.println();
    }
}

static void Pattern3(int n){
    for(int row=1;row<=n;row++){
        //for every row,run the col
        for(int col=1;col<=n-row+1;col++){
            System.out.print("* ");
        }
        //when one row is printed ,we need  to add a newline
        System.out.println();
    }
}

static void Pattern4(int n){
    for(int row=1;row<=n;row++){
        //for every row,run the col
        for(int col=1;col<=row;col++){
            System.out.print(col+" ");
        }
        //when one row is printed ,we need  to add a newline
        System.out.println();
    }
}

static void Pattern5(int n){
    for(int row=0;row<=2*n;row++){
        int totalColInRow=row>n?2*n-row:row;
        for(int col=0;col<totalColInRow;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
}


static void Pattern28(int n){
    for(int row=0;row<=2*n;row++){
        int totalColInRow=row>n?2*n-row:row;
        int noOfSpaces=n-totalColInRow;
        for(int s=0;s<=noOfSpaces;s++){
            System.out.print(" ");
        }
        for(int col=0;col<totalColInRow;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void Pattern30(int n){
    for(int row=1;row<=n;row++){
        for(int space=1;space<=n-row;space++){
            System.out.print(" ");
        }
        for(int col=row;col>=1;col--){
            System.out.print(col);
        }
        for(int col=2;col<=row;col++){
            System.out.print(col);
        }
        System.out.println();
    }
}


static void Pattern17(int n){
    for(int row=1;row<=n;row++){
        for(int space=1;space<=n-row;space++){
            System.out.print(" ");
        }
        for(int col=row;col>=1;col--){
            System.out.print(col);
        }
        for(int col=2;col<=row;col++){
            System.out.print(col);
        }
        System.out.println();
    }
    for(int row=n-1;row>=1;row--){
        for(int space=1;space<=n-row;space++){
            System.out.print(" ");
        }
        for(int col=row;col>=1;col--){
            System.out.print(col);
        }
        for(int col=2;col<=row;col++){
            System.out.print(col);
        }
        System.out.println();
    }

}
}
