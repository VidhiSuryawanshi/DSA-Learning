public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before" +a+" "+b);
        swap(a,b);
        System.out.println("After" +a+" "+b);
        Integer p = 11;
        Integer q = 22;
        System.out.println("Before" +p+" "+q);
        swap(p, q);
        System.out.println("After" +p+" "+q);

        Wrapper one = new Wrapper();
        Wrapper two = one;
        one.name = "Something Something";
        System.out.println(two.name);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer p, Integer q){
        int temp = p;
        p = q;
        q = temp;
    }

}


class Wrapper{
    String name;
}
