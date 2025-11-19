public class ReverseStringRecursion {


    static String reverse(String s, int index){
        if(index<0){
            return "";
        } 
        return s.charAt(index)+reverse(s, index-1);
    }
public static void main(String[] args) {
    String k="kapil"; 
    String reversed=reverse(k, k.length()-1);
    System.out.println(reversed);

}
}
