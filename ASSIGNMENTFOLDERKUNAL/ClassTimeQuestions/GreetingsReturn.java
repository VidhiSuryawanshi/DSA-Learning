public class GreetingsReturn {
    public static void main(String[] args) {
        String message=Greet();
        System.out.println(message);
    }
    static String Greet(){
        String greeting="Everything is Fine";
        return greeting;
    }
}