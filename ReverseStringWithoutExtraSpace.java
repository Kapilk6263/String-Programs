public class ReverseStringWithoutExtraSpace {
    public static void main(String[] args) {
        ReverseStringWithoutExtraSpace s=new ReverseStringWithoutExtraSpace();
        System.out.println(s.reverse("kapil"));
    }

    public String reverse(String s){
        char [] ch=s.toCharArray();
       int st=0;
       int end=ch.length-1;

       while (st<end) {
           char temp=ch[st];
           ch[st]=ch[end];
           ch[end]=temp;
           st++;
           end--; 
       }
       return new String(ch);
    
}
}
