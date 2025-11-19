public class LowerToUpper {
    public static void main(String[] args) {
        String str="kApil";
        String str2="";
    
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
       if(ch>='a' && ch<='z'){
        ch=(char) (ch-32);
        str2=str2+ch;
       }else {
        ch=(char) (ch+32);
        str2=str2+ch;
       }
    }
    System.out.println(str2);
    }
}
