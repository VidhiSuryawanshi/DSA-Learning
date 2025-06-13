import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Nummber you want to cheack +ve ,-ve or zero ");
        int a = input.nextInt();

        if(a>=0){
            if(a==0){
                System.out.println("Given number is zero :");
            }
            else{
                System.out.println("Given number is positive");
            }
        }
        else{
            System.out.println("Given number is Negative");
        }
    }
}