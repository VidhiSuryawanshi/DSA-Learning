public class Greeting {
    public static void main(String[] args) {
        // Student kunal = new Student();
        Student Vidhi = new Student(23,"Mumma I really Love You",22.2f);
        // kunal.greeting();
        // Vidhi.greeting("Vidhi");
        Vidhi.changeName("Shoe Lover");
    }
}

class Student{
    int rno;
    String name;
    float marks=90;

    void greeting(){
        System.out.println("Hellow! My name is "+this.name);
    }

    void greeting(String name){
        System.out.println("Hellow! My name is "+this.name);
    }

    void changeName(String newName){
        this.name=newName;
        // name=newName;
        System.out.println(name);
    }


    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(){
        this.rno=13;
        this.name="Kunal Kushwaha";
        this.marks=88.5f;
    }
}
