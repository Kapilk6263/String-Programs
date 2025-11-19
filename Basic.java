public class Basic {
    public static void main(String[] args) {
        String k="Kapil";
        String u;
        // StringBuilder b=new StringBuilder(k);
        // k.split(",");

         int n=k.length();
         System.out.println(k);
        for(int i=0;i<n;i++){
            System.out.println(k.charAt(i));
        } 

         for(int i=n-1;i>1;i--){
            System.out.println(k.charAt(i));
        }

        
    }
}
