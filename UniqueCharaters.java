public class UniqueCharaters {
    public static void main(String[] args) {
        String str="java is programming";
        int [] frequency=new int[256];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            frequency[c]++;

        } 
        for(int j=0;j<frequency.length;j++){
           if(frequency[j]==1){
            System.out.print((char) j+" : ");
            System.out.println(frequency[j]);
           }

        } 
    }
}


//387