public class CallConsByAnotherCons {
    public static void main(String[] args) {
        Student random = new Student();
        Student random2 = new Student(4,"Vidhi",33);
        Student random3 = new Student(1,"Kunal",22.3f);
        System.out.println(random.roll_no);
        System.out.println(random2.toString());
        System.out.println(random3.marks);
        System.out.println(random.name);
        System.out.println(random.name);

    }
}

class Student{
    int roll_no=89;
    String name;
    float marks;


    // this is how another function is called
    Student(Student other){
        this.roll_no=other.roll_no;
        this.name=other.name;
        this.marks=other.marks;
    }

    // Student(){
    //     this(13,"Mummy",100.f);
    // }

    Student(){
        this.roll_no=90;
        this.name="Kunal Kushwaha";
        this.marks = 90.2f;
    }

    Student(int roll_no,String name,float marks){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=56;
    }


    public String toString(){
        return roll_no + name+ marks;
    }
}