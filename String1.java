public class String1 {
    public static void main(String[] args) {
     String str="sky is blue";
     String [] words=str.split("");

     String result="";

     for(int i=words.length-1;i>=0;i--){
           result+=words[i];
           if(i!=0){
            result+=" ";
           }
     }
    System.out.println(result);
    } 
    
}
