import java.util.Scanner;

public class TakeInputbyuser {
    public static void main(String[] args) {
        //Rollno. Name CGPA Geender
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Roll No :");
        int Rollno = in.nextInt();

        System.out.println("Enter the Name :");
        String Name = in.nextLine();

        System.out.println("Enter the CGPA :");
        float CGPA = in.nextFloat();

        System.out.println("Enter the gender (male/Female) :");
        char gender = in.next().charAt(0);


        System.out.println(Name+" "+Rollno+" "+CGPA+" "+gender);

    }
}
