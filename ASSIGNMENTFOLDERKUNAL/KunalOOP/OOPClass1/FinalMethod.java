// Cant Undestand

public class FinalMethod {
    public static void main(String[] args) {
        final A kunal = new A("Kunal Kushwaha");
        kunal.name ="Other name";
        A obj;
        for(int i=0;i<100000000000000;i++){
            obj = new A("random name");
            System.out.println(obj.name);
        }


    }
}


class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name=name;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     // TODO Auto-generated method stub
    //     super.finalize();
    // }


    @Override
    protected void finalize()throws Throwable{
        System.out.println("obj.destroyed");
    }
}