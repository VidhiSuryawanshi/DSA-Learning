public class SearchingInString {
    public static void main(String[] args) {
        String name="Kunal";
        char target='i';
        int ans=check(name,target);
        System.out.println(ans);

    }
    static int check(String name,char target){
        if(name.length()==0){
            return -1;
        }
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return i;
            }
        }
    return -1;
    }
}
