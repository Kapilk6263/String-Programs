public class ReverseWords {
    public static void main(String[] args) {
        String str="sky is blue";
        String rev="";
        String word="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
           
            if(c !=' '){
             word+=c;
          }else {
            rev=word+" "+rev;
            word=" ";
          }
        }
        rev=word+" "+rev;
        System.out.println(rev);
    }
}
