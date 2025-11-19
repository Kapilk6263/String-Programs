import java.util.*;

public class LongestSubStr {
    public static void main(String[] args) {
        
        String str="abcaabbcc";

        int l=0;
        int max_l=0;

        Map<Character, Integer> mp=new HashMap<>();
        for(int r=0;r<str.length();r++){
            char ch=str.charAt(r);
           if(mp.containsKey(ch)){
             if(mp.get(ch)>=l){
             l=mp.get(ch)+1;
             }
           }
           mp.put(ch, r);
           max_l=Math.max(max_l, r-l+1);
        }

      System.out.println(max_l);
    }
}
