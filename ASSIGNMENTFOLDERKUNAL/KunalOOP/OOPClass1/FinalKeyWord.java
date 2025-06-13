public class FinalKeyWord {
    public static void main(String[] args) {
        // A kunal = new A ("Vidhi Suryawanshi");
        final A kunal = new A ("Vidhi Suryawanshi");
        System.out.println(kunal.name);  //Vidhi Suryawanshi
        kunal.name = "Other name";
        System.out.println(kunal.name);
        // kunal = new A("New Object");    //Error if final use
        System.out.println(kunal.name);
    }
}

class A{
    final int num = 10;
    String name ;

    A(String name){
        this.name = name;
    }
}
