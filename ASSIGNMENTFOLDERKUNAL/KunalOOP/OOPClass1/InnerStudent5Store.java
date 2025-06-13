// package ASSIGNMENTFOLDERKUNAL.KunalOOP.OOPClass1;

// public class Student5Store {
//     public static void main(String [] args){
//         int [] roll_no = new int[5];
        // String [] name = new String[5] ;
        // Float[] marks = new Float[5];
        // for(int i=0;i<5;i++){
        //     roll_no [i]=i;
        // }
        // for(int a:roll_no){
        //     System.out.print(a+" ");
        // }
//     }
// }






// package ASSIGNMENTFOLDERKUNAL.KunalOOP.OOPClass1;
// public class InnerStudent5Store {
//     public static void main(String[] args) {
//         Student [] student = new  Student[5];
//         student[0] = new Student(2,"Vidhi",23.3);
//         System.out.println(student[0].toString());
//         student[1] = new Student(12,"Vishakha",93.3);
//         System.out.println(student[1].toString());
//     }
// }

// class Student{
//     int roll_no ;
//     String name ;
//     double marks ;

//     Student(int roll_no,String name,double marks){
//         this.roll_no = roll_no;
//         this.name = name;
//         this.marks = marks;
//     }

//     public  String toString(){
//         return "RollNo=" + roll_no +"\nName="+ name +"\nMarks="+marks;
//     }
// }





// public class InnerStudent5Store {
//     public static void main(String[] args) {
//         Student[] students = new Student[5];
//         // Student Kunal;
//         // System.out.println(Arrays.toString(students));   //[null, null, null, null, null]
//         Student Kunal = new Student();
//         System.out.println(Kunal);
//         System.out.println(Kunal.roll_no);
//         Kunal.roll_no=13;
//         Kunal.name = "Vidhi";
//         System.out.println(Kunal.roll_no);
//         System.out.println(Kunal.name);
//         System.out.println(Kunal.marks);
//     }
// }

// class Student{
//     int roll_no;
//     String name;
//     Float marks;
// }




import java.util.Arrays;
public class InnerStudent5Store {
    public static void main(String[] args) {
        Student kunal =  new Student();
        System.out.println(kunal.toString());
    }
}

class Student{
    int roll_no;
    String name;
    float marks = 90;

    Student(){
        this.roll_no=13;
        this.name="Kunal Kushwaha";
        this.marks=85.5f;
    }

    public String toString(){
        return roll_no + name + marks;
    }

}





