import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        // String str="hello";
       
        // int [] frequency=new int[256];

        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     frequency[c]++;

        // } 
        // for(int j=0;j<frequency.length;j++){
        //    if(frequency[j]>0){
        //     System.out.print((char) j+" : ");
        //     System.out.println(frequency[j]);
        //    }

        // } 

        String str="hello world";

        HashMap <Character,Integer> h=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(h.containsKey(c)){
                h.put(c, h.get(c)+1);
            }else{
                h.put(c, 1);
            }
        } 
        System.out.println(h);

    }
}
