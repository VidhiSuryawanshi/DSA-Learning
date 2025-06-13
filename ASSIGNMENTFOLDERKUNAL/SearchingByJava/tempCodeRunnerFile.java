public class SearchingInString {
    public static void main(String[] args) {
        String name="Kunal";
        char target='u';
        int ans=check(name,target);
        System.out.println(ans);

    }
    static int check(String name,char target){
        if(name.length()==0){
            return -1;