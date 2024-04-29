public class Prtc {
    public static void permutationString(String string, String ans){
        if(string.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            String ros =string.substring(0, i)+string.substring(i+1);
            permutationString(ros, ans+ch);
            
        }
        
    }
    public static void main(String[] args) {
        String string="abc";
        permutationString(string, "");
    }
    
}
