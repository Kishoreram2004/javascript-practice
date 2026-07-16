public class day7dsa {
    public static void rec(String n, String rev, int i){
        if(i==0){
                rev+=n.charAt(i);
              System.out.println(rev);
              return;
        }
        rec(n, rev+n.charAt(i), i-1);
    }
    public static void main(String[] args){
        String str = "kishore";
        rec(str, "", str.length()-1);
    }
}
