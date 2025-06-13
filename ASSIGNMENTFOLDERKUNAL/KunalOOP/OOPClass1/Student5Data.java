// package ASSIGNMENTFOLDERKUNAL.KunalOOP.OOPClass1;
import java.util.Arrays;
public class Student5Data {
    public static void main(String[] args) {
        // int roll_no = new int[];
        // String [] name = new String[5];
        // Float [] marks = new Float[5];
        Student Kunal = new Student(7);
        System.out.println(Kunal.roll_no);
    }
}

class Student{
    int roll_no;

    Student(int roll_no){
        this.roll_no=roll_no;
    }
}
