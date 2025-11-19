public class Palindrome {
    public static void main(String[] args) {
        
        String str="kapil";
        // String str="nitin";
        String rev="";

        for(int i=0;i<str.length();i++){
           rev=str.charAt(i)+rev;
        }
        
        // if(rev.equalsIgnoreCase(str))
        if(rev.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
